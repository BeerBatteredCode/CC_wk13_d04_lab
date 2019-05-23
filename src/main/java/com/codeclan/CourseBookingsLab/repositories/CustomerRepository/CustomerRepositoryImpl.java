package com.codeclan.CourseBookingsLab.repositories.CustomerRepository;

import com.codeclan.CourseBookingsLab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersByCourse(Long id){
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.course", "courseAlias");
            cr.add(Restrictions.eq("courseAlias.id", id));

            result = cr.list();
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        finally {
            session.close();
        }
        return result;
    }

    @Transactional
    public List<Customer> findCustomersByTownAndCourse(String town, Long id){
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("town", town).ignoreCase());
            cr.add(Restrictions.eq("bookingAlias.course.id", id));

            result = cr.list();
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        finally {
            session.close();
        }
        return result;
    }

    @Transactional
    public List<Customer> findCustomersByTownAndCourseAndAge(String town, Long id, int age){
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("town", town).ignoreCase());
            cr.add(Restrictions.eq("bookingAlias.course.id", id));
            cr.add(Restrictions.ge("age", age));

            result = cr.list();
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        finally {
            session.close();
        }
        return result;
    }

}
