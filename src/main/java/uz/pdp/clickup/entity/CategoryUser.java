package uz.pdp.clickup.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.enums.TaskPermission;
import uz.pdp.clickup.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CategoryUser extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

    @Enumerated
    private TaskPermission taskPermission;
}
