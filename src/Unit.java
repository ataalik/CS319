package sample;
import java.util.*;

public class Unit {

    private Province location;//Which province the unit is in
    private boolean canAttack;//If unit can move or not
    private boolean canMove;//If unit can move or not

    //Constructor
    Unit(Province location, boolean canAttack, boolean canMove) {
        this.location = location;
        this.canAttack = canAttack;
        this.canMove = canMove;
    }

    //Getters and setters

    public Province getLocation() {
        return location;
    }

    public boolean isCanAttack() {
        return canAttack;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public void setLocation(Province location) {
        this.location = location;
    }
}
