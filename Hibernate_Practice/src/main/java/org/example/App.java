package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        BootstrapServiceRegistry bootstrapRegistry = new BootstrapServiceRegistryBuilder()
                .build();

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder(bootstrapRegistry)
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(registry)
                .getMetadataBuilder()
                .build();

        try (SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build()) {
            try (Session session = sessionFactory.openSession()) {
                List<Order> orders = session.createQuery("from Order").list();
                orders.forEach(System.out::println);

                Date today = Date.valueOf("2025-06-30");
                Order order = new Order("Test_product", 111, 333, today);
                session.beginTransaction();
                session.persist(order);
                session.getTransaction().commit();

                orders = session.createQuery("from Order").list();
                orders.forEach(System.out::println);

                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
