import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());

        int total = 1;
        int i = 1;

        while(i <= input){
            total *= i;
            i++;
        }
        System.out.println("Factorial is " + total);
    }
}
