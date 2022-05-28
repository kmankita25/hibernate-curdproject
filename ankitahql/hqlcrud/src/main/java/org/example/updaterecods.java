package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class updaterecods {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Scanner scn = new Scanner(System.in);
        System.out.println("enter roll no for update");
        crud cu = (crud) session.get(crud.class,scn.nextInt());
        if(cu !=null)
        {
            System.out.println("enter new name for update");
            cu.setName(scn.next());
            session.update(cu);
            session.flush();
            tx.commit();
            System.out.println("one records update sucessfully");
        }
        else
        {
            System.out.println("records not available plz enter correct roll no");
        }
        session.close();
        sessionFactory.close();
    }
}
