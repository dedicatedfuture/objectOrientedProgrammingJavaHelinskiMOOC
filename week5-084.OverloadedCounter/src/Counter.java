/**
 * Created by Bill on 1/3/18.
 */
public class Counter {
    private int number;
    boolean isPositive;

    public Counter(int startingValue, boolean check){
        this.number = startingValue;
        this.isPositive = check;
    }
    public Counter(int startingValue){
        this.number = startingValue;
        this.isPositive = true;
    }

    public Counter(boolean check){
        if (check){
            this.number = 0;
        }
        this.isPositive = check;
    }

    public Counter(){
        this.number = 0;
        this.isPositive = true;
    }

//    public void boolean isPositive(int numCheck){
//        if (numCheck >= 0){
//            return true;
//        }
//        return false;
//    }


    public int value(){
        return this.number;
    }

    public void increase(){
        this.number ++;
    }

    public void decrease(){


        if (isPositive){
            if (number > 0) {
                this.number--;
            }
        }else{
            this.number--;
        }
    }

    public void increase(int value){
        if(value >= 0){
            this.number += value;
        }

    }

    public void decrease(int value){

        if (value > 0) {
            if (isPositive) {
                if (value <= this.number) {
                    this.number -= value;
                } else {
                    this.number = 0;
                }
            }else{
                this.number -= value;
            }
        }



    }

}
