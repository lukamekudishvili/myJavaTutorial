package Section10Challenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contactToAdd) {
        int index = findContact(contactToAdd);
        if (index == -1) {
            myContacts.add(Contact.createContact(contactToAdd.getName(), contactToAdd.getPhoneNumber()));
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index == -1) {
            return false;
        }
        removeContact(oldContact);
        addNewContact(newContact);
        return true;

    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if(index!=-1){
            myContacts.remove(index);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if ((contact.getName()).equals((myContacts.get(i).getName()))) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if ((name).equals((myContacts.get(i).getName()))) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index !=-1) {
            return this.myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1)+". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

}
