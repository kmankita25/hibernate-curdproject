package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class crud
{
    private String name;
    private int roll;
    private float cgpa;
    private String college;

    public String getCollege()
    {
        return college;
    }

    public void setCollege(String college)
    {
        this.college = college;
    }

    public float getCgpa()
    {
        return cgpa;
    }

    public void setCgpa(float cgpa)
    {
        this.cgpa = cgpa;
    }

    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
        this.roll = roll;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return "Student Details?= roll: " + this.roll + ", Name: " + this.name+ ", cgpa: " + this.cgpa+ ", Course: " + this.college;
    }
}



