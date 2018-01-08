import java.util.Random;

/**
 * Created by Bill on 1/7/18.
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height){
        this.density = .1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){


        for(int i = 0; i < this.width; i++){
            Random randNum = new Random();
            double newDouble = randNum.nextDouble();
            if(newDouble < this.density){
                System.out.print("*");
                this.starsInLastPrint++;
            }else{
                System.out.print(" ");
            }

        }
    }

    public void print(){
        this.starsInLastPrint = 0;
        for(int i=0; i < this.height; i++){
            this.printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
