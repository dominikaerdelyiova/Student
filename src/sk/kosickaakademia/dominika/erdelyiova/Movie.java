package sk.kosickaakademia.dominika.erdelyiova;

public class Movie extends Hobby {
    private int year;

    public Movie(String name) {
        super(name);
        this.year=year;
    }

    public int getYear(){
        return year;
    }
}
