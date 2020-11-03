package sk.kosickaakademia.dominika.erdelyiova;

public class Cycling extends Hobby {
    private String genre;

    public Cycling(String name, String genre) {
        super(name);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}