
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First:");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Last:");
        int secondNumber = Integer.parseInt(reader.nextLine());

        if (firstNumber <= secondNumber){
            while(firstNumber <= secondNumber){
                System.out.println(firstNumber);
                firstNumber++;
            }


        }
    }
}
