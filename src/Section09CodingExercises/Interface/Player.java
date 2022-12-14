package Section09CodingExercises.Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name, weapon;
    private int hitPoints, strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(this.name);
        list.add( String.valueOf(this.hitPoints));
        list.add(String.valueOf(this.strength));
        list.add(this.weapon);
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list!=null && list.size()>0) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name='"+name+"', hitPoints="+this.hitPoints+", strength="+this.strength+", weapon='"+this.weapon+"'}";
    }
}
