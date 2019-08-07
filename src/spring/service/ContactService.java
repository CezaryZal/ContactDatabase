package spring.service;

import spring.entity.Contact;

import java.util.List;

public interface ContactService {

    void saveContact(Contact contact);

    List<Contact> getContacts();

    public Contact getContact(int id);
}
