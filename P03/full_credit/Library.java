import java.util.ArrayList;
public class Library {

    public Library (String name) {
        this.name = name;
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }   

    public void checkOut(int publicationIndex, String patron) {
        //calls checkOut
        
        for(int i=0; i<publications.size(); i++) {
            publicationIndex += 1;
        }
        //TODO: revise method (void return type)
    } 
    

    @Override
    public String toString () {
        return name + "\n\n" + publications;
    }

    private String name;
    private ArrayList<Publication> publications = new ArrayList<>();
}