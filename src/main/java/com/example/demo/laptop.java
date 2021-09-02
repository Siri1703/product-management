package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class laptop extends gadgets {
    private String model;
    private String name;
    private int cost;
    private List<String> apps;
    private Map<String,String> address=new HashMap<String,String>();

    public laptop(String id,String model, String name, int cost )
    {
        super(id,"Laptop");
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

    public List<String> getApps() {
        return apps;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public String toString()
    {
        return super.toString()+" "+this.model+" "+this.name+" "+this.cost+" ";
    }
}
