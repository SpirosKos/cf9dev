package gr.aueb.cf.cf9.ch11;

public class Main {
    public static void main(String[] args) {

        Customer spiros = new Customer(1L,"Spir","Ks","102930","1243214","EU",
                "At", "Athens","G","AA","123","123@email.com");

        Product milk = new Product(1L,"Milk A", "Light Milk",1.5, 2, true);

        User user = new User();
        User spir = new User(1L, "Spir", "Ks", "Gld", " 123", true);

        System.out.println(spir.getFirstname());

        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        Student student2 = new Student(2, "Makis", " Kapetis");
        student2.setFirstname("Xrisostomos");
//        alice.id = 1;
//        bob.id = 2;
//        student.firstname = "George";

        alice.setId(1);                         //  setter
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        // object.instance
        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        student.setId(3);
        student.setFirstname("Anna");
        student.setLastname("Karenina");


        System.out.println(alice.getId());      //  getter
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alice.getId(),alice.getFirstname(),alice.getLastname());

        //  Static methods or etc need Classname.static
        System.out.println(Student.getStudentsCount());
    }
}
