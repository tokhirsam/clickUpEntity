package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.enums.StatusType;


import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Status {

    @GeneratedValue
    @Id
    private UUID id;

    private String name;

    @ManyToOne
    private Space space;
    @ManyToOne
    private Project project;
    @ManyToOne
    private Category category;
    private String color;
    @Enumerated(EnumType.STRING)
    private StatusType statusType;
}
