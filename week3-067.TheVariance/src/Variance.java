import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int num : list){
            total += num;
        }
        return total;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list) / (double)list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double num = 0;
        double avgList = average(list);
        for (double num1 : list){
            num += Math.pow(num1 - avgList, 2.0);
        }
        double denom = (double)list.size() - 1.0;
        double variance = num / denom;

        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
