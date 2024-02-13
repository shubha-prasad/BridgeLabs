public class Address {

   private String FirstName;
   private String LastName;
    private String Address;
    private String City;
    private String State;
     private int Zip;
   private long PhoneNumber;
    private String EmailId;

    public Address() {
    }

    public Address(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String emailId) {
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        City = city;
        State = state;
        Zip = zip;
        PhoneNumber = phoneNumber;
        EmailId = emailId;

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int zip) {
        Zip = zip;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Zip=" + Zip +
                ", PhoneNumber=" + PhoneNumber +
                ", EmailId='" + EmailId + '\'' +
                '}';
    }
}
