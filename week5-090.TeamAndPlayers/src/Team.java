import java.util.ArrayList;

/**
 * Created by Bill on 1/4/18.
 */
public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name){
        this.name = name;
        this.maxSize = 16;
    }

    public String getName(){
        return this.name;
    }

    public void addPlayer(Player player){
        if(players.size() < maxSize) {
            this.players.add(player);
        }

    }

    public void printPlayers(){
        for(Player play : players){
            System.out.println(play);
        }
    }

    public void setMaxSize(int maxSize){
       this.maxSize = maxSize;
    }
    public int size(){
        return players.size();
    }

    public int goals(){
        int total= 0;
        for(Player play : players){
            total += play.goals();
        }
        return total;
    }
}
