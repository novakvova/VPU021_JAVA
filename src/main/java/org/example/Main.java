package org.example;

import entities.Author;
import entities.Book;
import entities.Role;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateSessionFactoryUtil;


public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner in = new Scanner(System.in, "UTF-8");
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Role role=new Role();
//        role.setName("Admin");
//        session.save(role);
//        System.out.println("Role id: "+ role.getId());
//        Query query = session.createQuery("FROM Role");
//        List<Role> roles = query.list();
//        for (Role r : roles) {
//            System.out.println(r.getName());
//        }
//        Book book=new Book();
//        book.setName("Бедрик");
//        Author a = new Author();
//        a.setId(1);
//        book.setAuthor(a);
//        session.save(book);
        Query query = session.createQuery("FROM Book");
        List<Book> roles = query.list();
        for (Book b : roles) {
            System.out.println(b.getAuthor().getFullName()+ " " + b.getName());
        }
        session.close();

    }
}