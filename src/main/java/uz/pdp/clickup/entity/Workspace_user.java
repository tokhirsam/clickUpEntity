package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Workspace_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @OneToOne
    private Workspace workspaceId;

    @OneToOne
    private User userId;

    @OneToOne
    private Workspace_role workspaceRoleId;

    private Timestamp dateInvited;

    private Timestamp dateJoined;

}
