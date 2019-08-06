package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.dao.ContactDAO;
import spring.entity.Contact;
import spring.service.ContactService;

import java.util.List;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService service;


    @GetMapping("/list")
    public String listContacts(Model theModel){

        List<Contact> theContacts = service.getContacts();
        theModel.addAttribute("contacts", theContacts);

        return "list-contacts";
    }

    @GetMapping("/showFromForAdd")
    public String addContact(Model theModel){

        Contact contact = new Contact();
        theModel.addAttribute("contact", contact);

        return "add-contact";
    }

    @PostMapping("/saveContact")
    public String saveContact(@ModelAttribute("contact") Contact contact){

        service.saveContact(contact);
        return "redirect:/contact/list";
    }


}
