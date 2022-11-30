package org.example;

import com.pluralsight.model.Car;
import com.pluralsight.model.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Vehicle obj=(Vehicle) context.getBean("car");     //ako je dostupan car dobice car, ako je bike dobice bike
        obj.drive();
    }
}