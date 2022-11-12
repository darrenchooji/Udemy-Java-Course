package Section08CodingExercises.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        int indexOfContact = findContact(contact);
        if (indexOfContact == -1) {
            this.myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int indexOfContact = findContact(oldContact);
        if (indexOfContact != -1) {
            this.myContacts.set(indexOfContact, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        int indexOfContact = findContact(contact);
        if (indexOfContact != -1) {
            this.myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        int indexOfContact = -1;
        for (Contact contacts : this.myContacts) {
            if (contacts.getName().equalsIgnoreCase(contact.getName())) {
                indexOfContact = this.myContacts.indexOf(contacts);
            }
        }
        return indexOfContact;
    }

    private int findContact(String contactName) {
        int indexOfContact = -1;
        for (Contact contact : this.myContacts) {
            if (contact.getName().equalsIgnoreCase(contactName)) {
                indexOfContact = this.myContacts.indexOf(contact);
            }
        }
        return indexOfContact;
    }
    
    public Contact queryContact(String contactName) {
        Contact queriedContact = null;
        int indexOfContact = findContact(contactName);
        if (indexOfContact != -1) {
            queriedContact = this.myContacts.get(indexOfContact);
        }
        return queriedContact;
    }

    public void printContacts() {
        System.out.println("Contact List :");
        for (Contact contacts : this.myContacts) {
            System.out.println((this.myContacts.indexOf(contacts)+1)+". "+contacts.getName()+" -> "+contacts.getPhoneNumber());
        }
    }
}
