package sample;
import java.util.*;

public class Player {
    private String name;//Name of the player
    private String playerColor;//Color of the player
    private int unitNumber;//Number of the units that the player has
    private ArrayList<Province> occupiedProvinces;//Occupied places from the player
    private int noOfRegion;
    private int ID;
    //Constructor
    Player(String name, String playerColor, int unitNumber, int ID) {
        this.name = name;
        this.playerColor = playerColor;
        this.unitNumber = unitNumber;
        this.ID = ID
        this.occupiedProvinces = new ArrayList<>();//ArrayList has been created
        this.occupiedProvinces = occupiedProvinces;
        this.noOfRegion = 0;
        this.noOfArmy = 0;
      }
    Player(String name , String PlayerColor)
    {
        this.name = name;
        this.playerColor = playerColor;
        this.unitNumber = 0;
        this.occupiedProvinces = new ArrayList<>();//ArrayList has been created
        this.noOfRegion = 0;
     }
    //Getters and setters
    public void setID(int id)
    {
      this.ID = id;
    }
    public int getID()
    {
      return this.ID
    }
    

    public String getName() {
        return name;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public String getPlayerColor() {
        return playerColor;
    }

      public void setName(String name) {
        this.name = name;
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
    public void 
 }