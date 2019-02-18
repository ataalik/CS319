public class Map{
 
 private String size;
 private String continents;
  
 public Map()
 {
   size = "";
   continents = "";
 }
  
 public  void setSize( String desiredSize)
 {
   size = desiredSize;
 }
 
  public  void setContinents( String desiredContinent)
 {
    continents = desiredContinent;
 }
 
  public  String getSize()
  {
    return size;
  }
  
  public  String getContinent()
  {
    return  continents;
  }
  
}