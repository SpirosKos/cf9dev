package gr.aueb.cf.cf9.ch16;

public class Main {

    public static void main(String[] args) {
        Book book = new Book.Builder(1, "A123").build();
        Book book2 = new Book.Builder(2, "A456")
                .author("John")
                .title("LOTR")
                .build();

        Book book3 = new Book.Builder(3,"B123")
                .title("JS")
                .build();
    }
}
