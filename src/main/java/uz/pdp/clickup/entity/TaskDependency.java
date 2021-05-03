package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.enums.DependencyType;
import uz.pdp.clickup.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TaskDependency extends AbsEntity {

    @ManyToOne
    private Task task;

    @OneToOne
    private TaskDependency taskDependency;

    @Enumerated
    private DependencyType dependencyType;
}
