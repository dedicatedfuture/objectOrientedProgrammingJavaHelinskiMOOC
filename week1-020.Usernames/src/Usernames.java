
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a user name:");
        String userName = reader.nextLine();
        System.out.print("Enter a password:");
        String pword = reader.nextLine();
        if ((userName.equals("alex") && pword.equals("mightyducks")) || (userName.equals("emily") && pword.equals("cat"))){
            System.out.println("You are now logged into the system");
        }else{
            System.out.println("Either your username or password were invalid");
        }

    }
}
