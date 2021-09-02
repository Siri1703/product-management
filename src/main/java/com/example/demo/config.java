package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.util.Scanner;


@Configuration
@ComponentScan("com.example.demo")
public class config {
@Bean
@Scope(value = "prototype")
    public laptop getLaptop()
{
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter the model number");
   String m=sc.next();
   System.out.println("Enter the name");
   String name=sc.next();
   System.out.println("Enter the cost");
   int cost=sc.nextInt();
   System.out.println("Enter gadget category(laptop) id");
   String gid=sc.next();
   return new laptop(gid,m,name,cost);
}

    @Bean
    @Scope(value = "prototype")
    public memory getMemory() {
        System.out.println("Please Enter the Details of laptop you want to add");
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter RAM storage");
        String primary=sc.next();
        System.out.println("Enter Secondary storage");
        String sec=sc.next();
        return new memory(primary,sec);
    }
    @Bean
    @Scope(value="prototype")
    public mobile getMobile()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the model number");
        String m=sc.next();
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the cost");
        int cost=sc.nextInt();
        System.out.println("Enter gadget category(mobile) id");
        String gid=sc.next();
        return new mobile(gid,m,name,cost);
    }
    @Bean
    @Scope(value = "prototype")
    public pmemory getPmemory() {
        System.out.println("Please Enter the Details of mobile you want to add");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter RAM storage");
        String primary=sc.next();
        System.out.println("Enter Secondary storage");
        String sec=sc.next();
        System.out.println("Enter OS Name");
        String os=sc.next();
        System.out.println("Enter Manufacturer");
        String man=sc.next();
        return new pmemory(primary,sec,os,man);
    }


}
