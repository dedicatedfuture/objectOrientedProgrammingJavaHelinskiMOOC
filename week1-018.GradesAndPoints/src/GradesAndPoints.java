
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What score did you get on the test? ");
        int testScore = Integer.parseInt(reader.nextLine());

        if(testScore <= 29){
            System.out.println("You Failed!");
        }else if(testScore <= 34){
            System.out.println("You got a 1");
        }else if(testScore <= 39){
            System.out.println("You got a 2");
        }else if(testScore <= 44){
            System.out.println("You got a 3");
        }else if(testScore <= 49){
            System.out.println("You got a 4");
        }else if(testScore <= 60){
            System.out.println("You got a 5");
        } else {
            System.out.println("Please enter a number between 0 and 60");
        }

    }
}
