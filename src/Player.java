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
        this.cards = new ArrayList<>();//ArrayList has been created
        this.cards = cards;
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

    public ArrayList<Province> getOccupiedProvinces() {
        return occupiedProvinces;
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

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    //This method decreases the unit number of the player
    public int decreaseUnitsBy(int num){
        return getUnitNumber() - num;
    }

    //This method increases the unit number of the player
    public int increaseUnitsBy(int num){
        return getUnitNumber() + num;
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
    public ArrayList<Province> availableProvinces(ArrayList<Province> occupiedProvinces){
        if (occupiedProvinces.size() == 0){return null;}//If there is no province that has occupied
        else {
            ArrayList<Province> availableProvinces = new ArrayList<>();//This list will have the all possible provnices to attack for all provinces that are occupied
            for (Province temp : occupiedProvinces) {//Temp iteratively correspondes to every occupied province
                for (Province insideTemp : temp.getAdjacentProvinces) {//Getting the adjacent provinces for each occupied provinces from temp by using the variable inseideTemp iteratively
                    availableProvinces.add(insideTemp);//Adding the province that can be attacked to the created linked list
                }
            }
            return availableProvinces;//Returning the provinces that can be attacked
        }
    }

    //This methods find a random adjacent province to attack
    public Province findProvinceToAttack(ArrayList provinces){
        if(this.unitNumber <= 1){
            return null;
            System.out.println("Cannot attack due to the lack of unit forces!");
        }else {

        }
        return null;//Holder
    }
}