package builder;

public class Movie {

    private String title;
    private String genre;
    private double length;
    private boolean ninjas;

    public Movie(String title, String genre, double length, boolean ninjas) {
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.ninjas = ninjas;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isNinjas() {
        return ninjas;
    }

    public void setNinjas(boolean ninjas) {
        this.ninjas = ninjas;
    }
}
