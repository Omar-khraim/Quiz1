package Model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emailAddresses;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = new ArrayList<>();
        this.emailAddresses = new ArrayList<>();
    }

    public void addPhoneNumber(String number, String label) {
        phoneNumbers.add(new PhoneNumber(number, label));
    }

    public void addEmailAddress(String address, String label) {
        emailAddresses.add(new Email(address, label));
    }

    // Getters and setters can be added for other attributes if needed

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<Email> getEmailAddresses() {
        return emailAddresses;
    }

    public String getLastName() {
        return lastName;
    }
}
