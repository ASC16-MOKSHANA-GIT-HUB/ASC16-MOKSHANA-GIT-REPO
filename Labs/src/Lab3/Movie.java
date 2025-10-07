package Lab3;

class Movie {
    private final String movieId;
    private String movieName;
    private String producedBy;
    private String directedBy;
    private double duration;
    private int year;
    private String category;

    private static int moviesCount = 0;

    public Movie(String movieName, String producedBy) {
        this.movieName = movieName;
        this.producedBy = producedBy;
        moviesCount++;
        this.movieId = movieName + "_" + moviesCount;
    }

    public Movie(String movieName, String producedBy, String directedBy,
                 double duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public void setDetails(String directedBy, double duration, int year, String category) {
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public String getMovieId() {
        return movieId;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String showDetails() {
        return "Movie ID: " + movieId +
                ", Name: " + movieName +
                ", Produced By: " + producedBy +
                ", Directed By: " + directedBy +
                ", Duration: " + duration + " hrs" +
                ", Year: " + year +
                ", Category: " + category;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Hello", "XYZ Productions");
        m1.setDetails("John Smith", 2.0, 2022, "Drama");
        System.out.println(m1.showDetails());
        System.out.println("Movie ID: " + m1.getMovieId());

        Movie m2 = new Movie("Inception", "Emma Thomas",
                "Christopher Nolan", 2.5, 2010, "Sci-Fi");
        System.out.println(m2.showDetails());

        System.out.println("Total movies created: " + Movie.getMoviesCount());
    }
}


























