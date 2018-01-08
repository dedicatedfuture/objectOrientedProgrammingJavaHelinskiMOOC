/**
 * Created by Bill on 1/7/18.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class BirdDatabase {
    ArrayList<Bird> birdsList = new ArrayList<Bird>();
    Scanner reader = new Scanner(System.in);

    public void start(){
        String input = "";

        while(true){
            System.out.print("?");
            input = reader.nextLine();
            if(input.equals("Quit")){
                break;
            }else if(input.equals("Add")){
                this.add();
            }else if(input.equals("Observation")){
                this.observation();
            }else if(input.equals("Statistics")){
                this.statistics();
            }else if(input.equals("Show")){
                this.show();
            }
        }

    }
    public void add(){
        String input = "";
        String input2 = "";
        System.out.print("Name: ");
        input = reader.nextLine();
        System.out.print("Latin Name: ");
        input2 = reader.nextLine();
        Bird newBird = new Bird(input, input2);
        birdsList.add(newBird);
    }


    public void observation(){
        String input = "";
        System.out.print("What was observed? ");
        input = reader.nextLine();
        for(Bird bird : birdsList){
            if(bird.getName().equals(input)){
                bird.observed();
            }else{
                System.out.println("Is not a bird!");
            }
        }

    }

    public void statistics(){
        for(Bird bird : birdsList){
            System.out.println(bird);
        }

    }

    public void show(){
        String input = "";
        System.out.print("What?");
        input = reader.nextLine();
        for(Bird bird : birdsList){
            if(bird.getName().equals(input)){
                System.out.println(bird);
            }
        }

    }

    public void quit(){

    }

}
