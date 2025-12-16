package gr.aueb.cf.cf9.ch16;

import java.util.Locale;

public class Book {
    private final long id;
    private final String title;
    private final String author;
    private final String isbn;

    private Book(Builder builder){
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.author = builder.author;
        this.title = builder.title;

    }

    public static class Builder{
        private final long id;
        private final String isbn;
        private String title = " ";
        private String author = " ";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        // Fluent Setter - returns the Builder object - chaining
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
