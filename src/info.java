public class info {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private int age;

    private info(infoBuilder infoBuilder) {
        this.firstName = infoBuilder.firstName;
        this.lastName = infoBuilder.lastName;
        this.email = infoBuilder.email;
        this.address = infoBuilder.address;
        this.phone = infoBuilder.phone;
        this.age = infoBuilder.age;
    }

    protected static class infoBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private int age;

        public infoBuilder addFirstName(String firstName) {
            this.firstName = firstName;

            return this;
        }

        public infoBuilder addLastName(String lastName) {
            this.lastName = lastName;

            return this;
        }

        public infoBuilder addEmail(String email) {
            this.email = email;

            return this;
        }

        public infoBuilder addAddress(String address) {
            this.address = address;

            return this;
        }

        public infoBuilder addPhone(String phone) {
            this.phone = phone;

            return this;
        }

        public infoBuilder addAge(int age) {
            this.age = age;

            return this;
        }

        public info build() {
            return new info(this);
        }
    }

    @Override
    public String toString() {
        return "User:" + firstName + "," + lastName + "," +  email + "," +  address + "," +  phone + "," +  age;
    }
}