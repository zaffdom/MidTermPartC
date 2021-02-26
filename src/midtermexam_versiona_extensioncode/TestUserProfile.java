package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**Test User Profile
 *This class +++Insert Description Here+++
 * @author Domenic Zaffino
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner usrInput = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = usrInput.next();
        System.out.println("Pick your favourite genre: ");
        System.out.println("Comedy, Drama, Action, Mystery ");
        String genre = usrInput.next();
        usrInput.close();
        //pass name and gere to UserProfile class
        UserProfile usr = new UserProfile (name,genre);
        //output message
        System.out.println("Name: "+usr.getUserID()+"\nGenre: "+usr.getGenre());
        System.out.println("Your user profile has been created");
    }

}
