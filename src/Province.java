
    
package sample;
import java.util.*;

public class Province {

    private String name;//Name of the province
    private ArrayList<Province> adjacentProvinces;//Adjacent provinces
    private ArrayList<Province> adjacentEnemyProvinces;//Adjacent provinces
    private Player owner;//Which player has this province
    private ArrayList<Unit> unitsPresent;//Which units are present at the moment
    private Color colorOfProvince;//Color of the province

    //Constructor
    Province (String name, Player owner,  Color colorOfProvince){
        this.name = name;
        this.adjacentProvinces = new ArrayList<>();//ArrayList has been created
        this.adjacentEnemyProvinces = new ArrayList<>();
        this.owner = owner;
        this.unitsPresent = new ArrayList<>();//ArrayList has been created
        this.colorOfProvince = colorOfProvince;
    }
    Province(String name)
    {
    	 this.adjacentProvinces = new ArrayList<>();
         this.adjacentEnemyProvinces = new ArrayList<>();
         this.unitsPresent = new ArrayList<>();
         this.name = name;
         owner = null;
         unitsPresent = new ArrayList<>();
         colorOfProvince = null;
    }
    //Getters and setters

    public String getName()
    {
        return name;
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

   
    public void setName(String name) {
        this.name = name;
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
    
    public void addAdjacentProvince(Province province)
    {
    	this.adjacentProvinces.add(province);
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

    public ArrayList<Province> getEnemyProvinces()
    {
        return adjacentEnemyProvinces;
    }

   
    public void setUnitsPresent(ArrayList<Unit> unitsPresent) 
    {
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
