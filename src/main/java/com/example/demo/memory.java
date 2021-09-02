package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class memory {
    @Autowired
    private laptop lap;
    private String primary;
    private String secondary;
  public  memory(String primary,String secondary)
    {
        this.primary=primary;
        this.secondary=secondary;
    }

   /* public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public void setLap(laptop lap) {
        this.lap = lap;
    }
    public void init() throws Exception
    {
        System.out.println("Bean is initialized");
    }
    public void destroy() throws Exception
    {
        System.out.println("Bean is destroyed");
    }*/
    public void printdetailslaptop()
    {
        /*for(String i:lap.getApps())
    {
        System.out.print(i);
    }*/
        System.out.println(" Your laptop is added .Details of laptop are:");
        System.out.print(lap);
        System.out.print(" "+primary);
        System.out.print(" "+secondary);
        System.out.println();
    }

}
