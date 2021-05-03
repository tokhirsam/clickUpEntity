package uz.pdp.clickup.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.enums.ColorName;
import uz.pdp.clickup.template.AbsEntity;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Tag extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @Enumerated
    private ColorName color;

    @ManyToMany
    private Set<Workspace> workspaces;
}
