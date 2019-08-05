package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.dao.ContactDAO;
import spring.entity.Contact;

import java.util.List;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactDAO contactDAO;


    @RequestMapping("/list")
    public String listContacts(Model theModel){

        List<Contact> theContacts = contactDAO.getContacts();
        theModel.addAttribute("contacts", theContacts);

        return "list-contacts";
    }
}
