package uz.pdp.clickup.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CheckListItem extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private CheckList checkList;

    private String resolved;//o'zgarishi mumkin

    @OneToOne
    private User assignedUser;
}
