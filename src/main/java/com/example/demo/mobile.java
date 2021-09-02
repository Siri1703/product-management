package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mobile extends gadgets {
    private String model;
    private String name;
    private int cost;

    public mobile(String id,String model, String name, int cost )
    {
        super(id,"mobile");
        this.model = model;
        this.name = name;
        this.cost = cost;
    }

/* public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }*/

    public String toString()
    {
        return super.toString()+" "+this.model+" "+this.name+" "+this.cost+" ";
    }
}
