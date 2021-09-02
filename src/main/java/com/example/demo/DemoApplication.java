package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="admin";
		System.out.println("Welcome to product management system");
		System.out.println("Admins can login to add products");
		System.out.println("Enter your username:");
		String uname=sc.next();
		System.out.println("Enter your password");
		String pass=sc.next();
		if(uname.equals(s1) && pass.equals(s1)) {
			System.out.println("Select the products you want to add");
			System.out.println("Laptop:L");
			System.out.println("Mobile:M");
			char ch = sc.next().charAt(0);
			if (ch == 'L') {


				SpringApplication.run(DemoApplication.class, args);
				ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		/*gadgets g=(gadgets)context.getBean("gadgets");
		g.details();
		gadgets g1=(gadgets)context.getBean("gadgets1");
		g1.details();
		g1 = (gadgets) context.getBean("gadgets2");
		g1.details();
		*/
				memory m = (memory) context.getBean("getMemory");
				m.printdetailslaptop();
			}
			else if(ch=='M') {
				SpringApplication.run(DemoApplication.class, args);
				ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
				pmemory p = (pmemory) context.getBean("getPmemory");
				p.printdetailsmobile();

			}

		}
		else
		{
			System.out.println("Wrong Password!!!");
		}


	}
}
