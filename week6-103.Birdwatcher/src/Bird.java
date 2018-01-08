/**
 * Created by Bill on 1/7/18.
 */
public class Bird {
    private String name;
    private String latinName;
    private int amountObserved;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.amountObserved = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getAmountObserved(){
        return amountObserved;
    }

    public void observed(){
        this.amountObserved++;
    }
    public String toString(){
        return this.name + " (" + this.latinName +"):" + this.amountObserved + " observations";
    }
}
