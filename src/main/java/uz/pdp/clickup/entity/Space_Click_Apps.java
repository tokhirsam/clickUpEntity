package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.Click_apps;
import uz.pdp.clickup.entity.Space;
import uz.pdp.clickup.entity.User;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Space_Click_Apps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @ManyToOne
    private Space space;
    @ManyToOne
    private Click_apps click_apps;

}
