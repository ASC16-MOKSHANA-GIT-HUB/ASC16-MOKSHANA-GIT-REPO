package entity;

public class SpecialMovie extends Movie {
    private String category;

    public SpecialMovie(String movieName, String producedBy, String category) {
        super(movieName, producedBy);
        this.category = category;
    }

    @Override
    public void showDetails() {
        System.out.println("Special Movie: " + movieName + ", Produced By: " + producedBy + ", Category: " + category);
    }

    public void specialOnlyMethod() {
        System.out.println("This is a SpecialMovie-only method.");
    }
}
