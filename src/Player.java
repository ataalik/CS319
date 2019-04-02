package sample;
import java.util.*;

public class Player {
    private String name;//Name of the player
    private String playerColor;//Color of the player
    private int unitNumber;//Number of the units that the player has
    private ArrayList<Province> occupiedProvinces;//Occupied places from the player
    private ArrayList<Card> cards;//Cards that the player has

    //Constructor
    Player(String name, String playerColor, int unitNumber, ArrayList occupiedProvinces, ArrayList cards) {
        this.name = name;
        this.playerColor = playerColor;
        this.unitNumber = unitNumber;
        this.occupiedProvinces = new ArrayList<>();//ArrayList has been created
        this.occupiedProvinces = occupiedProvinces;
        this.cards = cards;
    }
    Player(String name , String PlayerColor)
    {
    	this.name = name;
        this.playerColor = playerColor;
        this.unitNumber = 0;
        this.occupiedProvinces = new ArrayList<>();//ArrayList has been created
        cards = new ArrayList<>();
        
    }
    //Getters and setters


    public String getName() {
        return name;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public ArrayList<Card> getCard() {
        return cards;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCard(ArrayList<Card> card) {
        this.cards = card;
    }


    public void setOccupiedProvinces(ArrayList<Province> occupiedProvinces) {
        this.occupiedProvinces = occupiedProvinces;
    }

    public ArrayList<Province> getOccupiedProvinces() {
        return occupiedProvinces;
    }



    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = this.unitNumber + unitNumber;
    }


  //This method adds the occupied province of the player's occupied provinces
    public void addOccupiedProvinces(Province newProvince){
        occupiedProvinces.add(newProvince);
    }

    //This method removes the occupied province from the player's occupied provinces
    public void removeoccupiedProvince(Province removedProvince){
        occupiedProvinces.remove(removedProvince);
    }

    //This method adds card to the players cards
    public void addCards(Card newCard){
        cards.add(newCard);
    }

    //This method extracts card from the players cards
    public void extractCards(Card removedCard){
        cards.remove(removedCard);
    }

    //This method returns the all possible provinces that can be attacked if there is enough units
    public ArrayList<Province> availableProvinces(Province base)
    {
      if ( canAttack(base) )
      {
          return base.getEnemyProvinces();//Returning the provinces that can be attacked
      }
        return null ;
    }
    // this method returns if the selected province can attack or not
    public boolean canAttack(Province base){
        if(this.unitNumber > 1 && this.occupiedProvinces.contains(base))
        {
            return true;
        }
       return false;
    }

 }