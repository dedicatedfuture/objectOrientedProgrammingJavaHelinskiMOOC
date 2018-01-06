/**
 * Created by Bill on 1/4/18.
 */
public class Player {
    private String name;
    private int goals;

    public Player(String name, int goals){
        this.name = name;
        this.goals = goals;
    }
    public Player(String name){
        this.name = name;
        this.goals = 0;
    }

    public String getName(){
        return this.name;
    }

    public int goals(){
        return this.goals;
    }

    public String toString(){
        return this.name + ", goals " + this.goals;
    }
}
