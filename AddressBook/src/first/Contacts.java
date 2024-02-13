package first;

public class Contacts {
        String FirstName;
        String LastName;
        String Address;
        String City;
        String State;
        int Zip;
        long PhoneNumber;
        String EmailId;

        public Contacts()
        {
                super();
        }

        public Contacts(String firstname, String lastname, String address, String city, String state, int zip, long phonenumber, String emailid)
        {
                FirstName = firstname;
                LastName = lastname;
                Address = address;
                City = city;
                State = state;
                Zip = zip;
                PhoneNumber = phonenumber;
                EmailId = emailid;
        }


        public void setFirstName(String FirstName) {

                this.FirstName = FirstName;
        }

        public String getFirstName() {

                return FirstName;
        }

        public void setLastName(String LastName) {

                this.LastName = LastName;
        }

        public String getLastName() {

                return LastName;
        }

        public void setAddress(String Address) {

                this.Address = Address;
        }

        public String getAddress() {

                return Address;
        }

        public void setCity(String City) {

                this.City = City;
        }

        public String getCity() {

                return City;
        }

        public void setState(String State) {

                this.State = State;
        }

        public String getState() {

                return State;
        }

        public void setZip(int Zip) {

                this.Zip = Zip;
        }

        public int getZip() {

                return Zip;
        }

        public void setPhoneNumber(long PhoneNumber) {

                this.PhoneNumber = PhoneNumber;
        }

        public long getPhoneNumber() {

                return PhoneNumber;
        }

        public void setEmailId(String EmailId) {

                this.EmailId = EmailId;
        }

        public String getEmailId()
        {

                return EmailId;
        }
@Override
        public String toString()
        {
                return "Contacts [FirstName" + FirstName + "LastName" + LastName + "Address" + Address + "State" + State + "Zip" + Zip + "PhoneNumber" + PhoneNumber + "EmailId" + EmailId ;
        }

        public void display()
        {
                System.out.println("FirstName :" + FirstName + "LastName :" + LastName + "Address :" + Address + "City :" + City + "State :" + State + "Zip : " + Zip + "PhoneNumber :" + PhoneNumber + "EmailId :" + EmailId);
                System.out.println(" ");
        }


        }



