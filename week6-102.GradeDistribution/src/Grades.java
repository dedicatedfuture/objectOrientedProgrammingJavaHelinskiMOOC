/**
 * Created by Bill on 1/7/18.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Grades {
    ArrayList<Integer> grades = new ArrayList<Integer>();
    private int fives;
    private int fours;
    private int threes;
    private int twos;
    private int ones;
    private int zeros;
    private int accepted;

    public Grades() {
        this.fives = 0;
        this.fours = 0;
        this.threes = 0;
        this.twos = 0;
        this.ones = 0;
        this.zeros = 0;
        this.accepted = 0;
    }

    public ArrayList<Integer> listGrades(Scanner reader){
        System.out.println("Type exam scores, -1 completes:");
        while(true) {
            int newNum = Integer.parseInt(reader.nextLine());
            if(newNum == -1){
                break;
            } else {
                this.grades.add(newNum);
            }
        }
        return this.grades;
    }

    public void talleyGrades(){
        for(int i = 0; i < this.grades.size(); i++){
            System.out.println(this.grades.get(i));

            if(this.grades.get(i).intValue() >= 0 && this.grades.get(i).intValue() <= 29){
                this.zeros++;

            }else if(this.grades.get(i).intValue() <= 34 && this.grades.get(i).intValue() >= 30){
                this.ones++;
                this.accepted++;
            }else if(this.grades.get(i).intValue() <= 39 && this.grades.get(i).intValue() >= 35){
                System.out.println(this.twos);
                this.accepted++;
                this.twos++;
            }else if(this.grades.get(i).intValue() <= 44 && this.grades.get(i).intValue() >= 40){
                this.accepted++;
                this.threes++;
            }else if(this.grades.get(i).intValue() <= 49 && this.grades.get(i).intValue() >= 41){
                this.accepted++;
                this.fours++;
            }else if(this.grades.get(i).intValue() <= 60 && this.grades.get(i).intValue() >= 50){
                this.accepted++;
                this.fives++;
            }
        }


    }

    public void printGrades(){

        System.out.println("Grade distribution:");
        System.out.print("5: ");
        for(int i = 0; i < this.fives; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("4: ");
        for(int i = 0; i < this.fours; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("3: ");
        for(int i = 0; i < this.threes; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("2: ");
        for(int i = 0; i < this.twos; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("1: ");
        for(int i = 0; i < this.ones; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("0: ");
        for(int i = 0; i < this.zeros; i++){
            System.out.print("*");
        }
        System.out.println();

        int total = this.fives + this.fours + this.threes + this.twos + this.ones + this.zeros;


        double percent = ((double) this.accepted / (double) total ) * 100;

        System.out.println("Acceptance percentage: " + percent);
        System.out.println("percent " + percent);
        System.out.println("accepted " + this.accepted);
        System.out.println("total " + total);
    }




}
