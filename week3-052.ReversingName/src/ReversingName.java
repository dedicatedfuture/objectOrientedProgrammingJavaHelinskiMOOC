import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int i = name.length();
        String reversed = "";
//        while(i >= 0){
//            reversed += name.charAt(i);
//            i++;
//        }

        reversed = new StringBuilder(name).reverse().toString();

        System.out.println("In reverse order: " + reversed);
    }
}
