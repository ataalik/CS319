package sample;

import java.util.*;

public class Continent {

    private String name;//Name of the continent
    private int category;//Category of the continent defines the importance of it
    private ArrayList<Province> provinces;//Provinces that this continent have
    private Player owner;//If the continent has any owners

    //Constructor
    Continent(String name, int category, ArrayList provinces, Player owner) {
        this.name = name;
        this.category = category;
        this.provinces = new ArrayList<>();//ArrayList has been created
        owner = null;
    }
    Continent(String name , int category)
    {
    	this.name = name;
    	this.category = category;
    }

    //Getters and setters
    public int getCategory()
    {
        return this.category;
    }

    public String getName() 
    {
        return this.name;
    }

    public ArrayList getProvinces() 
    {
        return provinces;
    }

    public Player getOwner()
    {
        return owner;
    }

    public void setCategory(int category)
    {
    	
        this.category = category;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

 
    public void addProvince( Province province)
    {
    	provinces.add(province);
    }

    public void setOwner(Player owner) 
    {
        this.owner = owner;
    }
    
    public void determineOwner()
    {
    	if(ifOwner())
    	{
    		this.setOwner(provinces.getOwner());
    	}
    }
    private boolean ifOwner()
    {
    	Player onwerOfFirst = provinces[0].getOwner();
    	for(Province province : provinces)
    	{
    		if(province.getOwner() != ownerOfFirst)
    		{
    			return false;
    		}
    	}
    	return true;
    }
}
