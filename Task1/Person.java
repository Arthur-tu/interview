package Task1;

public class Person {
    private String  firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person(PersonBuilder personBuilder) {
    }

    public static class PersonBuilder {
        private String firstName = "";
        private String lastName = "";
        private String middleName = "";
        private String country = "";
        private String address = "";
        private String phone = "";
        private int age = 0;
        private String gender = "";

        public PersonBuilder(String firstName, String lastName, String middleName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
        }

        public PersonBuilder country(String val) {
            country = val;
            return this;
        }

        public PersonBuilder address(String val) {
            address = val;
            return this;
        }

        public PersonBuilder phone(String val) {
            phone = val;
            return this;
        }

        public PersonBuilder age(int val) {
            age = val;
            return this;
        }

        public PersonBuilder gender(String val) {
            gender = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

        private void Person(PersonBuilder pb) {
            firstName = pb.firstName;
            lastName = pb.lastName;
            middleName = pb.middleName;
            country = pb.country;
            address = pb.address;
            phone = pb.phone;
            age = pb.age;
            gender=pb.gender;
        }
    }
}
