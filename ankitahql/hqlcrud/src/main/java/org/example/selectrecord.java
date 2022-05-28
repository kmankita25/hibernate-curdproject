package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.security.auth.login.AppConfigurationEntry;
import java.util.Scanner;

public class selectrecord {
    public static void main(String[] args) {
       Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Scanner scn = new Scanner(System.in);
       /* System.out.println("enter roll no");
        crud st = (crud) session.load(crud.class,scn.nextInt());
        System.out.println("Student roll is:" + st.getRoll());
        System.out.println("Student name is:" + st.getName());
        System.out.println("Student cgpa is:" + st.getCgpa());
        System.out.println("Student college is:" + st.getCollege());*/
        //method 2
        System.out.println("enter roll no");
        crud cu = (crud) session.get(crud.class,scn.nextInt());
        System.out.println("Student roll is:" + cu.getRoll());
        System.out.println("Student name is:" + cu.getName());
        System.out.println("Student cgpa is:" + cu.getCgpa());
        System.out.println("Student college is:" + cu.getCollege());
    }
}
