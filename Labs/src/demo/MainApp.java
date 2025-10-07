package demo;

import entity.*;
import view.UserUI;

public class MainApp {
    public static void main(String[] args) {
        // ---------- Employee Layer ----------
        UserUI ui = new UserUI();
        ui.acceptEmpDetailsAndStore();
        ui.displayEmpByEmpno();

        // ---------- Movie Polymorphism ----------
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("Inception", "Nolan");
        movies[1] = new SpecialMovie("Avengers", "Marvel", "Action");
        movies[2] = new InternationalMovie("Parasite", "CJ", "Korea");

        for (Movie m : movies) {
            m.showDetails(); // Runtime Polymorphism

            if (m instanceof SpecialMovie) {
                ((SpecialMovie) m).specialOnlyMethod();
            }
            if (m instanceof InternationalMovie) {
                ((InternationalMovie) m).internationalOnlyMethod();
            }
        }

        // ---------- Interface Demo ----------
        B ref = new DemoClass();  // Interface reference variable
        ref.methodA();
        ref.methodB();

        C cref = new DemoClass();
        cref.methodC();
    }
}
