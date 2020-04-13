package builder;

public class MovieBuilder {

    private String title;
    private String genre;
    private double length;
    private boolean ninjas;

    public MovieBuilder(){
        //do nothing
    }

    public MovieBuilder title(String title){
        this.title = title;
        return this;
    }

    public MovieBuilder genre (String genre){
        this.genre = genre;
        return this;
    }

    public MovieBuilder length(double length){
        this.length = length;
        return this;
    }

    public MovieBuilder ninjas(boolean ninjas){
        this.ninjas = ninjas;
        return this;
    }

    public Movie build(){
        return new Movie(title, genre, length, ninjas);
    }
}
