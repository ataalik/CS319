package sample;
import java.util.*;

//This is the game class
public class Game {
    private ArrayList<Player> players; //Players of the game


    //Constructor
    Game(ArrayList<Player> players){
        players = new ArrayList<>();
    }

    //getters and setters

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    //This method add a new player to the game
    public void addPlayer(Player newPlayer){
        this.players.add(newPlayer);
    }

    //This method creates a new game
    public void newGame(){
        for (Player thePlayer: players) {
            players.add(thePlayer);
        }
    }
}