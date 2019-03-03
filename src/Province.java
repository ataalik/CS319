//package sample;
import java.util.*;

public class Province {

    private String name;//Name of the province
    private String inContinent;//Which continent this province belong to
    private ArrayList<Province> adjacentProvinces;//Adjacent provinces
    private ArrayList<Province> adjacentEnemyProvinces;//Adjacent provinces
    private Player owner;//Which player has this province
    private ArrayList<Unit> unitsPresent;//Which units are present at the moment
    private Color colorOfProvince;//Color of the province
    private int category;//Importance of the province

    //Constructor
    Province (String name, String inContinenet, ArrayList adjacentProvinces, Player owner, ArrayList unitsPresent, Color colorOfProvince, int category){
        this.name = name;
        this.inContinent = inContinenet;
        this.adjacentProvinces = new ArrayList<>();//ArrayList has been created
        this.adjacentEnemyProvinces = new ArrayList<>();
        this.adjacentProvinces = adjacentProvinces;
        this.owner = owner;
        this.unitsPresent = new ArrayList<>();//ArrayList has been created
        this.unitsPresent = unitsPresent;
        this.colorOfProvince = colorOfProvince;
        this.category = category;
    }

    //Getters and setters

    public String getName()
    {
        return name;
    }

    public String getInContinent()
    {
        return inContinent;
    }


    public Player getOwner()
    {
        return owner;
    }

    public ArrayList<Unit> getUnitsPresent()
    {
        return unitsPresent;
    }

    public Color getColorOfProvince()
    {
        return colorOfProvince;
    }

    public int getCategory()
    {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInContinent(String inContinent) {
        this.inContinent = inContinent;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setColorOfProvince(Color colorOfProvince) {
        this.colorOfProvince = colorOfProvince;
    }

    public void setAdjacentProvinces(ArrayList<Province> adjacentProvinces) {
        this.adjacentProvinces = adjacentProvinces;
    }

    public ArrayList<Province> getAdjacentProvinces() {
        return adjacentProvinces;
    }

    public void setEnemyProvinces(ArrayList<Province> adjacentProvinces) {
        for (Province temp : adjacentProvinces)
        {
            if( temp.getOwner() != this.getOwner())
            {
                adjacentEnemyProvinces.add(temp);
            }
        }
    }

    public ArrayList<Province> getEnemyProvinces() {
        return adjacentEnemyProvinces;
    }

    public void setCategory(int category) { this.category = category; }

    public void setUnitsPresent(ArrayList<Unit> unitsPresent) {
        this.unitsPresent = unitsPresent;
    }

    //This method updates the owner of the province
    public void updateOwner(Player newOwner){
        this.setOwner(newOwner);//Updating the owner
    }

    //This method increases the number of the units
    public void increaseUnits(Unit newUnit){
        unitsPresent.add(newUnit);
    }

    //This method decreases the number of the units
    public void decreaseUnits(Unit removedUnits){
        unitsPresent.remove(removedUnits);
    }


}