import java.util.ArrayList;
public class Library {

    public Library (String name) {
        this.name = name;
    }

    public addPublication(Publication publication) {
        publications.add(new Publication("The Bell Jar", "Sylvia Plath", 1963));

    }

    /*public checkOut(int publicationIndex, String patron) {

    } */

    @Override
    String toString () {
        return name + "\n\n" + publicationIndex + " " + publications;
    }

    private String name;
    private ArrayList<Publication> publications = new ArrayList<>();
}