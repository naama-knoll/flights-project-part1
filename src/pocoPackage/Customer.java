package pocoPackage;

public class Customer implements POCO{
    public long id;
    public String firstName;
    public String lastName;
    public String address;
    public String phoneNumber;
    public String creditCardNumber;
    public long userId;

    public Customer(long id, String firstName, String lastName, String address, String phoneNumber, String creditCardNumber, long userId) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.creditCardNumber = creditCardNumber;
        this.userId = userId;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", userId=" + userId +
                '}';
    }
}
