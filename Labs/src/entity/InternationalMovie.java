package entity;

public class InternationalMovie extends Movie {
    private String country;

    public InternationalMovie(String movieName, String producedBy, String country) {
        super(movieName, producedBy);
        this.country = country;
    }

    @Override
    public void showDetails() {
        System.out.println("International Movie: " + movieName + ", Produced By: " + producedBy + ", Country: " + country);
    }

    public void internationalOnlyMethod() {
        System.out.println("This is an InternationalMovie-only method.");
    }
}
