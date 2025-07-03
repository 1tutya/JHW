package org.example.mvc.dao;

import org.example.mvc.dto.OrderDto;
import org.example.mvc.models.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private final SessionFactory sessionFactory;

    @Autowired
    public OrderRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Order> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Order", Order.class).getResultList();
    }

    @Override
    @Transactional
    public void save(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(order);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Order order = session.get(Order.class, id);
        session.remove(order);
    }

    @Override
    @Transactional
    public Order getById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Order.class, id);
    }
}
