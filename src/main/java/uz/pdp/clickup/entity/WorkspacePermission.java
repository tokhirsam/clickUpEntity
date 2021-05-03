package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspacePermission {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

@ManyToOne
private Workspace_role workspaceRole;

}
