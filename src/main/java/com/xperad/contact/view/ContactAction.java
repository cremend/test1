package com.xperad.contact.view;

import com.opensymphony.xwork2.ActionSupport;
import com.xperad.contact.controller.ContactManager;
import com.xperad.contact.model.Contact;
import com.xperad.contact.model.Task;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xperad
 * Date: 2013/07/26
 * Time: 0:39
 * To change this template use File | Settings | File Templates.
 */
public class ContactAction extends ActionSupport {
    private static final long serialVersionUID = 9149826260758390091L;
    private Contact contact;
    private Task task;
    private List<Contact> contactList;
    private Long id;

    private ContactManager contactManager;

    public ContactAction() {
        contactManager = new ContactManager();
    }

    @Override
    public String execute() throws Exception {
        System.out.println("##### execute()");
        this.contactList = contactManager.list();
        contact = new Contact();
        this.contact.setEmailId("xperad@gmail.com");
        for (Contact c : contactList) {
            System.out.println("[" + c.getId() + "] " + c.getFirstName() + "/" + c.getLastName() + "/" + c.getCellNo() + "/" + c.getEmailId());
        }

        return SUCCESS;
    }

    public String add() {
        System.out.println("##### add()");
        System.out.println(getContact().getId());
        System.out.println(getContact().getFirstName());
        System.out.println(getContact().getLastName());
        System.out.println(getContact().getEmailId());
        System.out.println(getContact().getCellNo());
        System.out.println(getContact().getWebsite());
        System.out.println(getContact().getBirthDate());

        System.out.println(getTask().getTaskId());
        System.out.println(getTask().getTaskName());
        System.out.println(getTask().getDeadTime());
        System.out.println(getTask().getTaskSize());
//        try {
//            contactManager.add(getContact());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        this.contactList = contactManager.list();
        return SUCCESS;
    }

    public String add1() {
        System.out.println("##### add1()");
        System.out.println(getContactList().size());
        for (Contact c : contactList) {
            System.out.println("[" + c.getId() + "] " + c.getFirstName() + "/" + c.getLastName() + "/" + c.getCellNo() + "/" + c.getEmailId());
        }
        return SUCCESS;
    }

    public String delete() {
//        contactManager.delete(getId());
        return SUCCESS;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
