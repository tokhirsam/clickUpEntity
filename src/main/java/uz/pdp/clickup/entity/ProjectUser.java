package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.Project;
import uz.pdp.clickup.entity.User;
import uz.pdp.clickup.enums.TaskPermission;


import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectUser {

    @GeneratedValue
    @Id
    private UUID id;

    @ManyToOne
    private User user;
    @ManyToOne
    private Project project;
    @Enumerated(EnumType.STRING)
    private TaskPermission permission;
}
