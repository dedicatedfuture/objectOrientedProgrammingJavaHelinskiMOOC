
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what?");
        int input = Integer.parseInt(reader.nextLine());

        int i = 1;
        int total = 0;
        while(i <= input){
            total += i;
            i++;
        }
        System.out.println("Sum is " + total);
    }
}
