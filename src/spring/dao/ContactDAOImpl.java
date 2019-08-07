package spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.entity.Contact;

import java.util.List;

@Repository
public class ContactDAOImpl implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Contact> getContacts() {

        Session currentSession = sessionFactory.getCurrentSession();
        Query<Contact> theQuery = currentSession.createQuery("from Contact order by lastName", Contact.class);
        List<Contact> contacts = theQuery.getResultList();

        return contacts;
    }

    @Override
    public void saveContact(Contact contact) {

        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(contact);
    }

    @Override
    public Contact getContact(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Contact contact = currentSession.get(Contact.class, id);

        return contact;
    }
}
