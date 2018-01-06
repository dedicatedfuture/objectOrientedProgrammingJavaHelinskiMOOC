
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year:");

        int leapYr = Integer.parseInt(reader.nextLine());

        if ((leapYr % 100 == 0) && (leapYr % 400 == 0)){
            System.out.println("Thats a leap year!");
        }else if((leapYr % 4 == 0) && (leapYr % 100 != 0)){
            System.out.println("Thats a leap year!");
        }else{
            System.out.println("The year is not a leap year");
        }

    }
}
