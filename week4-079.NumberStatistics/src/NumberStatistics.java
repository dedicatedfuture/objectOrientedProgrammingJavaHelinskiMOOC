
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics(){

    }

    public void addNumber(int number){
        amountOfNumbers++;
        sum += number;
    }

    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }

    public int sum (){
        if (sum > 0 || sum < 0){
            return sum;
        }else {
            return 0;
        }
    }

    public double average(){
        if (sum > 0 || sum < 0){
            return (double)sum / (double) amountOfNumbers;
        }else {
            return 0;
        }
    }
}
