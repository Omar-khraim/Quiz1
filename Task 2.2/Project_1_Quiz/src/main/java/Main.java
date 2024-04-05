import Model.Contact;
import Model.Email;
import Model.PhoneNumber;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {




    public static void main(String[] args) {
        Contact contactDAvid = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");


        contactDAvid.addPhoneNumber("240-133-0011", "Home");
        contactDAvid.addEmailAddress("dave.sang@gmail.com", "Home");
        contactDAvid.addPhoneNumber("240-112-0123", "Mobile");
        contactDAvid.addEmailAddress("dsanger@argos.com", "Work");


        Contact Carlos = new Contact("Carlos", "Jimenez", "Zappos", "Director");

        Contact AliContact = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        AliContact.addPhoneNumber("412-116-9988", "Work");
        AliContact.addEmailAddress("ali@bmi.com", "Work");


        List<Contact> contacts = new ArrayList<>();
        contacts.add(Carlos);
        contacts.add(contactDAvid);
        contacts.add(AliContact);
        Collections.sort(contacts, (c1, c2) -> c1.getLastName().compareTo(c2.getLastName()));

        // Printing contacts in JSON format
        Gson gson = new Gson();
        String json = gson.toJson(contacts);
        System.out.println(json);
    }
}
