/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ksu.skillsup.Service;

import com.ksu.skillsup.Model.Contact;
import java.util.Collection;

/**
 *
 * @author ksu
 */
public interface ContactService {
    void addContact (Contact contact);
    void deleteContact (Contact contact);
    void updateContact(Contact contact);
    Contact getContact(String phone);
    Contact getContact(int id);
    Collection<Contact> getAllContacts();
    void clearAll();
}