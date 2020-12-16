package sample;
import java.util.*;

public class Card {

    private Province provinceOfCard;//Province of the card

    //Constructor
    Card(Province provinceOfCard) {
        this.provinceOfCard = provinceOfCard;
    }

    //Getters and setters

    public Province getProvinceOfCard() {
        return provinceOfCard;
    }

    public void setProvinceOfCard(Province provinceOfCard) {
        this.provinceOfCard = provinceOfCard;
    }
}
