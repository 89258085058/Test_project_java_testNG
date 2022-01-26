package ru.stqa.pft.addressbook;

public class ContactData {

    private final String FirstName;
    private final String MiddleName;
    private final String LastName;
    private final String Nickname;
    private final String Title;
    private final String Company;
    private final String Address;
    private final String Email;
    private final String Email2;
    private final String Email3;


    public ContactData(String FirstName, String MiddleName, String LastName, String Nickname,
                       String Title, String Company, String Address, String Email, String Email2,
                       String Email3) {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.Nickname = Nickname;
        this.Title = Title;
        this.Company = Company;
        this.Address = Address;
        this.Email = Email;
        this.Email2 = Email2;
        this.Email3 = Email3;
    }

    public String getFirstName() {
        return FirstName;
    }
    public String getMiddleName() {
        return MiddleName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getNickname() {
        return Nickname;
    }
    public String getTitle() {
        return Title;
    }
    public String getCompany() {
        return Company;
    }
    public String getAddress() {
        return Address;
    }
    public String getEmail() {
        return Email;
    }
    public String getEmail2() {
        return Email2;
    }
    public String getEmail3() {
        return Email3;
    }
}


