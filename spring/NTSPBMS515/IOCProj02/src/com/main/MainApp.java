package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sbeans.Driver;

public class MainApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cfgs/ApplicationContext.xml"); 

        Driver d = ctx.getBean("driver", Driver.class);
        d.drive();
    }
}