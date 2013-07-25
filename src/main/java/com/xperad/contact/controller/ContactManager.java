package com.xperad.contact.controller;

import com.xperad.contact.model.Contact;
import com.xperad.contact.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xperad
 * Date: 2013/07/26
 * Time: 0:32
 * To change this template use File | Settings | File Templates.
 */
public class ContactManager  {

    public Contact add(Contact contact) {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        session.save(contact);
//        session.getTransaction().commit();
        return contact;
    }

    public Contact delete(Long id) {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Contact contact = (Contact) session.load(Contact.class, id);
//        if (null != contact) {
//            session.delete(contact);
//        }
//        session.getTransaction().commit();
//        return contact;
        return null;
    }

    public List<Contact> list() {
        List<Contact> contacts = new ArrayList<Contact>();
        Contact contact = null;
        for (int i=0; i<5; i++) {
            contact = new Contact();
            contact.setId(Long.valueOf(i));
            contact.setFirstName("FN" + i);
            contact.setLastName("LN" + i);
            contact.setEmailId("email" + i + "@gmail.com");
            contact.setCellNo("090-2145-230" + i);
            contact.setWebsite("http://www.xperad.com/id" + i);
            contacts.add(contact);
        }
        return contacts;
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        List<Contact> contacts = null;
//        try {
//            contacts = (List<Contact>) session.createQuery("from Contact").list();
//
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            session.getTransaction().rollback();
//        }
//        session.getTransaction().commit();
//        return contacts;
    }
}
