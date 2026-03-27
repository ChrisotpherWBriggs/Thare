package com.rpg.thare.spells;
import com.rpg.thare.utils.diceRolls;
import com.rpg.thare.models.poison;
import com.rpg.thare.models.haste;
public class mage {
    //1st level spells
    public static int fire(int level){
        int num = 0;
        if(level > 5){
            num = 5;
        } else {
            num =  level;
        }
        return diceRolls.rollD4(num);
    }

    public static int shock(int level){
        int num = 0;
        if(level > 5){
            num = 5;
        } else {
            num =  level;
        }
        return diceRolls.rollD6(num);
    }

    public static int focus(int ac){
        ac = ac + 4;
        return ac;
    }

    public static boolean sleep(int will, int intel){
        int dc = (int) Math.floor((double) (intel - 10) /2) + 1 + 10;
        int save = diceRolls.rollD20(1) + will;
        boolean sleepStat;

        if( save >= dc ){
            sleepStat = false;
        } else {
            sleepStat = true;
        }
        return sleepStat;
    }

    //Level 2 Spells
    public static int blizzard(int level, int ref, int intel){
        int rays = (int)Math.floor((double) level/4);
        int atk = 0;
        int total = 0;

        if (rays > 3){
            atk = 3;
        } else {
          atk = rays;
        }
        for(int i = 0; i < atk; i++){
            int roll = diceRolls.rollD6(4);
            total = total + roll;
        }

        int save = diceRolls.rollD20(1) + ref;
        int dc = (int) Math.floor((double) (intel - 10) /2) + 2 + 10;

        if(save < dc){
            return total;
        } else {
            return (int)Math.floor((double) total/2);
        }

    }

    public static int intel(int intel){
        intel = intel + 4;
        return intel;
    }

    public static boolean dark (boolean darkStat){
        if(!darkStat){
            darkStat = true;
        } else {
            darkStat = true;
        }
        return darkStat;
    }

    public static poison poison(boolean pStat, int dmg){
        poison p = new poison();
        int percent = diceRolls.rollD100(1);
        int damage = diceRolls.rollD6(2);
        boolean stat = pStat;
        if (percent <= 25){
            stat = true;
        } else {
            stat = false;
        }

        p.setPStat(stat);
        p.setDmg(damage);

        return p;

    }
    //3rd level spells
    public static int fire2(int level, int ref, int intel){
        int total = diceRolls.rollD6(level);
        int dc = (int) Math.floor((double) (intel - 10) /2) + 3 + 10;
        int save = diceRolls.rollD20(1) + ref;

        if(save < dc){
            return total;
        } else {
            return (int)Math.floor((double) total/2);
        }

    }

    public static int lightning2(int level, int ref, int intel){
        int total = diceRolls.rollD6(level);
        int dc = (int) Math.floor((double) (intel - 10) /2) + 3 + 10;
        int save = diceRolls.rollD20(1) + ref;

        if(save < dc){
            return total;
        } else {
            return (int)Math.floor((double) total/2);
        }
    }

    public static int focus2(int ac){
        return ac + 8;
    }

    public static boolean hold(boolean stopStat, int will, int level, int intel){
        int dc = (int) Math.floor((double) (intel - 10) /2) + 3 + 10;
        int save = diceRolls.rollD20(1) + will;
        if (save >= dc) {
            stopStat = false;
        } else {
            stopStat = true;
        }

        return stopStat;
    }

    //4th level spells

    public static poison poison2(boolean pStat, int dmg){
        poison p = new poison();
        int percent = diceRolls.rollD100(1);
        int damage = diceRolls.rollD6(4);
        boolean stat = pStat;
        if (percent < 50){
            stat = true;
        } else {
            stat = false;
        }

        p.setPStat(stat);
        p.setDmg(damage);

        return p;

    }

    public static int blizzard2(int level, int ref, int intel){
        int total = diceRolls.rollD6(5) + diceRolls.rollD6(level);

        int save = diceRolls.rollD20(1) + ref;
        int dc = (int) Math.floor((double) (intel - 10) /2) + 4 + 10;

        if(save < dc){
            return total;
        } else {
            return (int)Math.floor((double) total/2);
        }

    }

    public static haste haste(boolean hStat, int ac, int will, int reflex, int fortitude){
        haste h = new haste();
        h.setHStat(true);
        h.setAc(ac + 1);
        h.setWill(will + 1);
        h.setReflex(reflex + 1);
        h.setFortitude(fortitude + 1);

        return h;
    }

    public static boolean sleep2(int will, int intel){
        int dc = (int) Math.floor((double) (intel - 10) /2) + 4 + 10;
        int save = diceRolls.rollD20(1) + will;
        boolean sleepStat;

        if( save >= dc ){
            sleepStat = false;
        } else {
            sleepStat = true;
        }
        return sleepStat;
    }

    //5th level spells

    public static int fire3(int level, int ref, int intel){
        int total = diceRolls.rollD6(5) + diceRolls.rollD6(level);

        int save = diceRolls.rollD20(1) + ref;
        int dc = (int) Math.floor((double) (intel - 10) /2) + 5 + 10;

        if(save < dc){
            return total;
        } else {
            return (int)Math.floor((double) total/2);
        }

    }

}
