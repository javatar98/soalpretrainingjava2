package gameobject;

import model.Item;
import model.Player;

/**
 * Created by root on 3/1/16.
 */
public class Kabuto extends Player {
    public Kabuto(){
        setName("Kabuto");
        setLevel(1);
        setHp(87);
        setMaxHP(87);
        setMp(0);
        setStr(15);
        setAgi(27);
    }
    @Override
    public void attack(Player enemy) {

    }

    @Override
    public void useItem(Item item) {

    }
}