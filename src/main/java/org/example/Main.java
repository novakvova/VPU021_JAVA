package org.example;

import entities.Role;

import java.io.PrintStream;
import java.util.Scanner;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;


public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner in = new Scanner(System.in, "UTF-8");
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.close();
        Role role=new Role();
        role.setName("Admin");
        System.out.println("Role "+role.getName());

    }
}