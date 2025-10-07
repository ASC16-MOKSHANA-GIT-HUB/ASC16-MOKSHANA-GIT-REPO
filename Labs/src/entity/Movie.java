package entity;

public class Movie {
    protected String movieName;
    protected String producedBy;

    public Movie(String movieName, String producedBy) {
        this.movieName = movieName;
        this.producedBy = producedBy;
    }

    public void showDetails() {
        System.out.println("Movie: " + movieName + ", Produced By: " + producedBy);
    }
}
