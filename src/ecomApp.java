public class ecomApp {
    public static void main(String[] args) {
        info neo = new info.infoBuilder()
                .addFirstName("Neo")
                .addLastName("Villanueva")
                .addAge(21)
                .addPhone("123456789")
                .addAddress("Hollywood")
                .addEmail("neo.villanueva@neu.edu.ph")
                .build();

        info jbiebs = new info.infoBuilder()
                .addPhone("987654321")
                .addEmail("j.biebs@gmail.com")
                .addAge(28)
                .addAddress("Peach Valley")
                .addLastName("Bibot")
                .addFirstName("Justin")
                .build();

        info zeus = new info.infoBuilder()
                .addAddress("Los Santos")
                .addPhone("87000")
                .addLastName("Kopo")
                .addEmail("zkopoalam@gmail.com")
                .addFirstName("Zeus")
                .addAge(99)
                .build();

        System.out.println(neo);
        System.out.println(jbiebs);
        System.out.println(zeus);
    }
}