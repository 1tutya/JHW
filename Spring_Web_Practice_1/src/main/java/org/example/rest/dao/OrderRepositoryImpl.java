package org.example.rest.dao;

import lombok.RequiredArgsConstructor;
import org.example.rest.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {
    @Autowired
    private final SessionFactory sessionFactory;

    @Override
    public List<Order> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Order", Order.class).getResultList();
    }

    @Override
    public Order findByID(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Order.class, id);
    }

    @Override
    public Order save(Order order) {
        Session session = sessionFactory.getCurrentSession();
        return session.merge(order);
    }

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Order where id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
