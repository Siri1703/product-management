package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class pmemory {
    private String primary;
    private String secondary;
    private String osname;
    private String country;
    @Autowired
    private mobile mob;
    public pmemory(String primary, String secondary, String osname, String country) {
        this.primary = primary;
        this.secondary = secondary;
        this.osname = osname;
        this.country = country;
    }

    public void printdetailsmobile()
    {
        System.out.println(" Your Mobile is added into Stock Details of mobile you added is:");
        System.out.print(mob);
        System.out.print(" "+primary);
        System.out.print(" "+secondary);
        System.out.print(" "+osname);
        System.out.print(" "+country);
        System.out.println();
    }

}
