
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Enter a number to compare: ");
        int bigCompare1 = Integer.parseInt(reader.nextLine());
        System.out.print("Enter another number to compare: ");
        int bigCompare2 = Integer.parseInt(reader.nextLine());

        if (bigCompare1 == bigCompare2){
            System.out.println("The bigger of the two numbers given was:" + bigCompare1);
        }else{
            System.out.println("The bigger of the two numbers given was:" + Math.max(bigCompare1, bigCompare2));
        }

    }
}
