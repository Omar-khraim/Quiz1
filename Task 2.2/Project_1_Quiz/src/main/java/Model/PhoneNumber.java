package Model;

public class PhoneNumber {

    String number;
    String title;

    public PhoneNumber(String number, String title){
        this.number = number;
        this.title = title;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

}
