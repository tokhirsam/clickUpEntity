package uz.pdp.clickup.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TimeTracked extends AbsEntity {

    @OneToOne
    private Task task;

    private Timestamp startedAt;
    private Timestamp stoppedAt;
}
