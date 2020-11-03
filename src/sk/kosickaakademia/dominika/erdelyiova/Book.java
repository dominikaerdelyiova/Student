package sk.kosickaakademia.dominika.erdelyiova;

public class Book extends Hobby {
    private String author;


    public Book(String name, String author) {
        super(name);
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }


}
