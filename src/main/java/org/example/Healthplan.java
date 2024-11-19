package org.example;

import org.example.enums.Plan;

public class Healthplan {
   private long id;
   private String name;
   private Plan plan;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    public Healthplan(long id, String name,Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Healthpla{id=" + id + ", name='" + name + "', plan=" + plan.getName() + " (" + plan.getPrice() + " USD)}";
    }
}
