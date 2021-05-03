package uz.pdp.clickup.entity;


import uz.pdp.clickup.template.AbsEntity;

import javax.persistence.ManyToMany;

public class TaskTag extends AbsEntity {

    @ManyToMany
    private Task task;

    @ManyToMany
    private Tag tag;
}
