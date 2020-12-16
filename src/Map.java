    
package sample;
import java.util.*;
	public class Map
	{
	 
	 private ArrayList<Continent> continents;
	  
	 public Map()
	 {
	   continents = new Arraylist<>();
	 }
	  
	    public  String getContinents()
	  {
	    return  continents;
	  }
	  public void initializeMap()
	  {
		  //creating continents
		  Continent north_america = new Continent("NORTH AMERICA" , 5);
		  Continent south_america = new Continent("SOUTH AMERICA" , 2);
		  Continent africa = new Continent("AFRICA" , 3);
		  Continent australia = new Continent("AUSTRALIA" , 2);
		  Continent europe = new Continent("EUROPE" , 6);
		  Continent asia = new Continent("ASIA" , 7);
		  //creating provinces
		  //for north america
		  Province alaska = new Province("Alaska" , null);
		  Province northwest_territories = new Province("NORTHWEST TERRITORIES" , null);
		  Province alberta = new Province("ALBERTA", null);
		  Province ontario = new Province("ONTARIO", null);
		  Province quebec = new Province("QUEBEC", null);
		  Province western = new Province("WESTERN US", null);
		  Province eastern = new Province("EASTERN US", null);
		  Province mexico = new Province("MEXICO", null);
		  Province greenland = new Province("GREENLAND", null);
		  //for sourth america
		  Province venezuela = new Province("VENEAUELA");
		  Province peru = new Province("PERU" );
		  Province brazil = new Province("BRAZIL");
		  Province argentina = new Province("ARGENTINA");
		  // for africa
		  Province north_africa = new Province("NORTH AFRICA" );
		  Province egypt = new Province("EGYPT" );
		  Province east_africa = new Province("EAST AFRICA");
		  Province congo = new Province("CONGO", null);
		  Province south_africa = new Province("SOUTH AFRICA");
		  Province madagaskar = new Province("MADAGASKAR");
		  //for australia
		  Province western_australia = new Province("WESTERN AUSTRALIA");
		  Province eastern_australia = new Province("EASTERN AUSTRALIA");
		  Province indonesia = new Province("INDONESIA");
		  Province  new_ginea = new Province("NEW GUINEA");
		  //for europe
		  Province western_europe = new Province("WESTERN EUROPE" );
		  Province eastern_europe = new Province("EASTERN EUROPE");
		  Province northern_europe = new Province("NORTHERN EUROPE");
		  Province  great_britain = new Province("GREAT BRÝTAÝN");
		  Province iceland = new Province("ICELAND");
		  Province scandinavia = new Province("SCANDINAVIA");
		  Province ukraine = new Province("UKRAINE");
		  //for asia
		  Province middle_east = new Province("MIDDLE EAST" );
		  Province india = new Province("INDIA");
		  Province siam = new Province("SIAMs");
		  Province  china = new Province("CHINA");
		  Province afghanistan = new Province("AFGHANISTAN");
		  Province mongolia = new Province("MONGOLIA");
		  Province ural = new Province("URAL");
		  Province japan = new Province("JAPAN " );
		  Province irkutsk = new Province("IRKUTSK");
		  Province  siberia = new Province("SIBERIA");
		  Province yakutsk = new Province("YAKUTS");
		  Province kamchatka = new Province("KAMCHATKA");
		  //making connections between provinces
		  // for alaska province
		  alaska.addAdjacentProvince(alberta);
		  alaska.addAdjacentProvince(northwest_territories);
		  alaska.addAdjacentProvince( kamchatka);
		  // for northwest-territories
		  northwest_territories.addAdjacentProvince(alaska);
		  northwest_territories.addAdjacentProvince(alberta);
		  northwest_territories.addAdjacentProvince(ontraio);
		  northwest_territories.addAdjacentProvince(greenland);
		  //for alberta
		  alberta.addAdjacentProvince(alaska);
		  alberta.addAdjacentProvince(northwest_territories);
		  alberta.addAdjacentProvince(ontario);
		  alberta.addAdjacentProvince(western);
		  //for ontario
		  ontario.addAdjacentProvince(quebec);
		  ontario.addAdjacentProvince(eastern);
		  ontario.addAdjacentProvince(western);
		  ontario.addAdjacentProvince(greenland);
		  ontario.addAdjacentProvince(alberta);
		  ontario.addAdjacentProvince(northwest_territories);
		  //for quebeck
		  quebeck.addAdjacentProvince(eastern);
		  quebeck.addAdjacentProvince(greenland);
		  quebeck.addAdjacentProvince(ontario);
		  //for western
		  western.addAdjacentProvince(alberta);
		  western.addAdjacentProvince(ontraio);
		  western.addAdjacentProvince(eastern);
		  western.addAdjacentProvince(mexico);
		  // for eastern
		  eastern.addAdjacentProvince(western);
		  eastern.addAdjacentProvince(mexico);
		  eastern.addAdjacentProvince(ontario);
		  eastern.addAdjacentProvince(quebec);
		  // for mexico
		  mexico.addAdjacentProvince(western);
		  mexico.addAdjacentProvince(eastern);
		  mexico.addAdjacentProvince(venezuela);
		  //for greenland
		  greenland.addAdjacent(quebec);
		  greenland.addAdjacent(northwest_territories);
		  greenland.addAdjacent(ontario);
		  greenland.addAdjacent(iceland);
		  // for venezuela province
		  venezuela.addAdjacentProvince(mexico);
		  venezuela.addAdjacentProvince(peru);
		  venezuela.addAdjacentProvince(brazil);
		  //for peru
		  peru.addAdjacentProvince(brazil);
		  peru.addAdjacentProvince(venezuela);
		  peru.addAdjacentProvince(argentina);
		  //for brazil
		  brazil.addAdjacentProvince(venezuela);
		  brazil.addAdjacentProvince(peru);
		  brazil.addAdjacentProvince(argentina);
		  brazil.addAdjacentProvince(north_africa);
		  //for argentina
		  argentina.addAdjacentProvince(brazil);
		  argentina.addAdjacentProvince(peru);
		  // for north africa province
		  north_africa.addAdjacentProvince(brazil);
		  north_africa.addAdjacentProvince(egypt);
		  north_africa.addAdjacentProvince(east_africa);
		  north_africa.addAdjacentProvince(congo);
		  //for egypt
		  egypt.addAdjacentProvince(north_africa);
		  egypt.addAdjacentProvince(east_africa);
		  egypt.addAdjacentProvince(new Province(middle_east);
		  egypt.addAdjacentProvince(new Province(eastern_europe ));
		  //for east africa
		  east_africa.addAdjacentProvince(egypt);
		  east_africa.addAdjacentProvince(congo);
		  east_africa.addAdjacentProvince(north_africa);
		  east_africa.addAdjacentProvince(middle_east);
		  east_africa.addAdjacentProvince(madagaskar);
		  // for congo
		  congo.addAdjacentProvince(east_africa);
		  congo.addAdjacentProvince(north_africa);
		  congo.addAdjacentProvince(south_africa);
		  //for south africa
		  south_africa.addAdjacentProvince(congo);
		  south_africa.addAdjacentProvince(east_africa);
		  south_africa.addAdjacentProvince(madagaskar);
		  // for madagaskar
		  madagaskar.addAdjacentProvince(south_africa);
		  madagaskar.addAdjacentProvince(east_africa);
		  //making connection between provinces
		  //for western australia
		  western_australia.addAdjacentProvince(eastern_australia);
		  western_australia.addAdjacentProvince(indonesia);
		  western_australia.addAdjacentProvince(new_ginea);
		  //for eastern australia
		  eastern_australia.addAdjacentProvince(western_australia);
		  eastern_australia.addAdjacentProvince(indonesia);
		  eastern_australia.addAdjacentProvince(new_ginea);
		  // for indonesia
		  indonesia.addAdjacentProvince(western_australia);
		  indonesia.addAdjacentProvince(new_ginea);
		  indonesia.addAdjacentProvince(siam);
		  //for new ginea
		  new_ginea.addAdjacentProvince(western_australia);
		  new_ginea.addAdjacentProvince(eastern_australia);
		  new_ginea.addAdjacentProvince(indonesia);
		  new_ginea.addAdjacentProvince(japan);
		  //for western uerope
		  western_europe.addAdjacentProvince(eastern_europe);
		  western_europe.addAdjacentProvince(northern_europe);
		  western_europe.addAdjacentProvince(great_britain);
		  // for eastern europe
		  eastern_europe.addAdjacentProvince(western_europe);
		  eastern_europe.addAdjacentProvince(northern_europe);
		  eastern_europe.addAdjacentProvince(ukraine);
		  eastern_europe.addAdjacentProvince(eastern_europe);
		  eastern_europe.addAdjacentProvince(egypt);
		  eastern_europe.addAdjacentProvince(middle_east);
		  //for northern europe
		  northern_europe.addAdjacentProvince(ukraine);
		  northern_europe.addAdjacentProvince(eastern_europe);
		  northern_europe.addAdjacentProvince(western_europe);
		  northern_europe.addAdjacentProvince(great_britain);
		  northern_europe.addAdjacentProvince(scandinavia);
		  //for great britain
		  great_britain.addAdjacentProvince(western_europe);
		  great_britain.addAdjacentProvince(northern_europe);
		  great_britain.addAdjacentProvince(iceland);
		  great_britain.addAdjacentProvince(scandinavia);
		  //for iceland
		  iceland.addAdjacentProvince(great_britain);
		  iceland.addAdjacentProvince(scandinavia);
		  iceland.addAdjacentProvince(greenland);
		  //for scandinavia
		  scandinavia.addAdjacentProvince(great_britain);
		  scandinavia.addAdjacentProvince(northern_europe);
		  scandinavia.addAdjacentProvince(iceland);
		  scandinavia.addAdjacentProvince(ukraine);
		  //for ukraine
		  ukraine.addAdjacentProvince(scandinavia);
		  ukraine.addAdjacentProvince(northern_europe);
		  ukraine.addAdjacentProvince(eastern_europe);
		  ukraine.addAdjacentProvince(ural);
		  ukraine.addAdjacentProvince(afghanistan);
		  ukraine.addAdjacentProvince(middle_east);
		// for middle esat
		  middle_east.addAdjacentProvince(india);
		  middle_east.addAdjacentProvince(east_africa);
		  middle_east.addAdjacentProvince(egypt);
		  middle_east.addAdjacentProvince(eastern_europe);
		  middle_east.addAdjacentProvince(ukraine);
		  middle_east.addAdjacentProvince(afghanistan);
		  //for afghanistan
		  afghanistan.addAdjacentProvince(ukraine);
		  afghanistan.addAdjacentProvince(middle_east);
		  afghanistan.addAdjacentProvince(india);
		  afghanistan.addAdjacentProvince(china);
		  afghanistan.addAdjacentProvince(ural);
		  // for ural
		  ural.addAdjacentProvince(ukraine);
		  ural.addAdjacentProvince(afghanistan);
		  ural.addAdjacentProvince(china);
		  ural.addAdjacentProvince(siberia);
		  //for siberia
		  siberia.addAdjacentProvince(ural);
		  siberia.addAdjacentProvince(yakutsk);
		  siberia.addAdjacentProvince(irkutsk);
		  siberia.addAdjacentProvince(mongolia);
		  siberia.addAdjacentProvince(china);
		  //for china
		  china.addAdjacentProvince(india);
		  china.addAdjacentProvince(siam);
		  china.addAdjacentProvince(afghanistan);
		  china.addAdjacentProvince(mongolia);
		  china.addAdjacentProvince(siberia);
		  china.addAdjacentProvince(ural);
		  //for india
		  india.addAdjacentProvince(middle_east);
		  india.addAdjacentProvince(afghanistan);
		  india.addAdjacentProvince(siam);
		  india.addAdjacentProvince(china);
		  //for siam
		  siam.addAdjacentProvince(indonesia);
		  siam.addAdjacentProvince(china);
		  siam.addAdjacentProvince(india);
		  //for mongolia
		  mongolia.addAdjacentProvince(irkutsk);
		  mongolia.addAdjacentProvince(japan);
		  mongolia.addAdjacentProvince(kamchatka);
		  mongolia.addAdjacentProvince(china);
		  mongolia.addAdjacentProvince(siberia);
		  //for irkutsk
		  irkutsk.addAdjacentProvince(siberia);
		  irkutsk.addAdjacentProvince(yakutsk);
		  irkutsk.addAdjacentProvince(kamchatka);
		  irkutsk.addAdjacentProvince(mongolia);
		  // for yakutsk
		  yakutsk.addAdjacentProvince(siberia);
		  yakutsk.addAdjacentProvince(irkutsk);
		  yakutsk.addAdjacentProvince(kamchatka);
		  //for kamchatka
		  kamchatka.addAdjacentProvince(alaska);
		  kamchatka.addAdjacentProvince(irkutsk);
		  kamchatka.addAdjacentProvince(yakutsk);
		  kamchatka.addAdjacentProvince(japan);
		  //for japan
		  japan.addAdjacentProvince(new_ginea);
		  japan.addAdjacentProvince(kamchatka);
		  japan.addAdjacentProvince(mangolia);
		  //adding provinces to continents
		  north_america.addProvince(alaska);
		  north_america.addProvince(northwest_territories);
		  north_america.addProvince(alberta);
		  north_america.addProvince(ontario);
		  north_america.addProvince(quebec);
		  north_america.addProvince(western);
		  north_america.addProvince(eastern);
		  north_america.addProvince(mexico);
		  north_america.addProvince(greenland);
		  south_america.addProvince(venezuela);
		  south_america.addProvince(peru);
		  south_america.addProvince(brazil);
		  south_america.addProvince(argentina);
		  africa.addProvince(north_africa);
		  africa.addProvince(egypt);
		  africa.addProvince(east_africa);
		  africa.addProvince(congo);
		  africa.addProvince(south_africa);
		  africa.addProvince(madagaskar);
		  australia.addProvince(western_australia);
		  australia.addProvince(eastern_australia);
		  australia.addProvince(indonesia);
		  australia.addProvince(new_ginea);
		  europe.addProvince(western_europe);
		  europe.addProvince(eastern_europe);
		  europe.addProvince(northern_europe);
		  europe.addProvince(great_britain);
		  europe.addProvince(iceland);
		  europe.addProvince(scandinavia);
		  europe.addProvince(ukraine);
		  asia.AddProvince(middle_east);
		  asia.AddProvince(india);
		  asia.AddProvince(siam);
		  asia.AddProvince(china);
		  asia.AddProvince(afghanistan);
		  asia.AddProvince(mongolia);
		  asia.AddProvince(ural);
		  asia.AddProvince(japan);
		  asia.AddProvince(irkutsk);
		  asia.AddProvince(siberia);
		  asia.AddProvince(yakutsk);
		  asia.AddProvince(kamchatka);
		  
		  //adding continents to the map
		  continents.add(north_america);
		  continents.add(south_america);
		  continents.add(africa);
		  continents.add(australia);
		  continent.add(europe);
		  continents.add(asia);
  }
	  
}
