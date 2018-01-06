import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number to compare: ");
        int bigCompare1 = Integer.parseInt(reader.nextLine());
        System.out.print("Enter another number to compare: ");
        int bigCompare2 = Integer.parseInt(reader.nextLine());

        if (bigCompare1 == bigCompare2){
            System.out.println("The numbers are equal.");
        }else{
            System.out.println("The bigger of the two numbers is: " + Math.max(bigCompare1, bigCompare2));
        }


    }
}
