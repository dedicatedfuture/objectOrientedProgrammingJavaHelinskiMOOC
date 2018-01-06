/**
 * Created by Bill on 12/29/17.
 */
public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
    }

    public void next(){
        if (this.value == upperLimit){
            this.value = 0;
        }else{
            this.value ++;
        }
    }

    public String toString(){
        if (this.value < 10){
            return "0" + this.value;
        }
        return "" + this.value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int newAmount){
        if (newAmount <= this.upperLimit && newAmount >= 0){
            this.value = newAmount;
        }
    }

}
