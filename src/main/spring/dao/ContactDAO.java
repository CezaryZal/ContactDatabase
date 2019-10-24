package spring.dao;

import spring.entity.Contact;

import java.util.List;

public interface ContactDAO {

    List<Contact> getContacts();

    void saveContact(Contact contact);

    public Contact getContact(int id);

    void deleteContact(int id);

    List<Contact> searchContacts(String searchName);
}

