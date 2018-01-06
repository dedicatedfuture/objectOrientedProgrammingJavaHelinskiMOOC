
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.

        while(true){
            System.out.println("Please enter a graph point:");
            double plotPoint = Double.parseDouble(reader.nextLine());

            if (plotPoint < -30 || plotPoint > 40){
                System.out.println("Please stay between -30 and 40");
            }else{
                Graph.addNumber(plotPoint);
            }


        }

        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}