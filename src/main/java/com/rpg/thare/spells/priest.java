package com.rpg.thare.spells;
import com.rpg.thare.models.protect;
import com.rpg.thare.utils.diceRolls;

public class priest {
    //1st level spells
    public static int cure(int hp, int level){
        int plus = 0;
        if (level > 5){
            plus = 5;
        } else {
            plus = level;
        }

        int total = diceRolls.rollD8(1) + plus;
        hp = hp + total;

        return hp;
    }

    public static int harm(int level){
        int plus = 0;
        if (level > 5){
            plus = 5;
        } else {
            plus = level;
        }

        return diceRolls.rollD8(1) + plus;
    }

    public static protect protect(int ac, int fort, int ref, int will){
        protect p = new protect();
        p.setAc(ac + 2);
        p.setFort(fort + 2);
        p.setRef(ref + 2);
        p.setWill(will + 2);

        return p;
    }

    public static boolean disrupt(boolean disStat){
        if (!disStat){
            disStat = true;
        }
        return disStat;
    }
    //2nd level spells
    //3rd level spells
    //4th level spells
    //5th level spells
    //6th level spells
    //7th level spells
    //8th level spells

}
