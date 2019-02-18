public class Player{
  
  private String name;
  private String  color;
  private int soldierNumber;
  
  
  public Player()
  {
    name = "";
    color = "";
    soldierNumber = 0;
  }
  
  public  void setName(String userName)
  {
    name = userName;
  }
  
  public  void setColor(String desiredColor)
  {
    color = desiredColor;
  }
  
  public  void setSoldierNumber(int numb)
  {
    soldierNumber = numb;
  }
  
  public  String getName()
  {
    return name;
  }
  
  public  String getColor()
  {
    return color;
  }
  public  int getSoldierNumber()
  {
    return soldierNumber;
  }
}