package sample;
import java.util.*;

//This is the game class
public class Game {
    private ArrayList<Player> players; //Players of the game
    private Map gameBoard; // map of the game

    //Constructor
    Game()
    {
    	players = new ArrayList<>();
    	gameBoard = new Map(); 
        initializePlayers();
    }
    //initializing players
    public void initializePlayers()
    {
   	 Scanner in = new Scanner(System.in);
   	 System.out.print("Please enter the number of players:  ");
   	 int numb = in.nextInt();
   	 
   	 for(int i = 0 ; i < numb ; i++)
   	 {
   		 System.out.println("Please enter the name of player" + i );
   		 String name = in.next();
   		 System.out.println("Please enter the color of player" + i );
   		 String color = in.next();
   		 players.add(new Player(name , color));
   	 }
   	 // troops will be distributed here
   }
   boolean isOver()
   {

	   ArrayList<Continent> tempContinent = gameBoard.getContinents();
	   Player temp_player = tempContinent.get(0).getOwner();
	   
	   for( Continent continent : tempContinent)
	   {
		   if(continent.getOwner() != temp_player )
		   {
			   return false;
		   }
	   }
	   return true;
   }
  

}
