package Model;

public class Email {

    String address;
    String label;

    public Email(String address, String label){
        this.address = address;
        this.label = label;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAddress() {
        return address;
    }

    public String getLabel() {
        return label;
    }

}
