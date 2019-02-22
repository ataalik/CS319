package sample;
import java.util.*;

public class Color {

    private ArrayList<String> colors;//Arraylist of colors

    //Constructor
    Color(ArrayList colors) {
        this.colors = new ArrayList<>();//Arraylist has been created
        this.colors = colors;
    }


    //Getters and setters

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {

    }
}
