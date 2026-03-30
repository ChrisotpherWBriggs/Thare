package com.rpg.thare.spells;
import com.rpg.thare.models.blades;
import com.rpg.thare.models.hut;
import com.rpg.thare.models.protect;
import com.rpg.thare.utils.diceRolls;
import com.rpg.thare.models.power;
import com.rpg.thare.models.resist;
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
    public static boolean nulShock(boolean shockStat){
        if (!shockStat){
            shockStat = true;
        }

        return shockStat;
    }

    public static boolean nulBlind(boolean blindStat){
        if (!blindStat){
            blindStat = true;
        }

        return blindStat;
    }

    public static int strong(int str){
        return str + 4;
    }

    public static int insight(int wis){
        return wis + 4;
    }
    //3rd level spells
    public static int cure2(int hp, int level){
        int plus = 0;
        if (level > 10){
            plus = 10;
        } else {
            plus = level;
        }

        int total = diceRolls.rollD8(2) + plus;
        hp = hp + total;

        return hp;
    }

    public static int harm2(int level) {
        int plus = 0;
        if (level > 10) {
            plus = 10;
        } else {
            plus = level;
        }

        return diceRolls.rollD8(2) + plus;
    }

    public static boolean nulFire(boolean fireStat){
        if(!fireStat){
            fireStat = true;
        }
        return fireStat;
    }

    public static int curse(int curseStat){
        curseStat = -4;
        return curseStat;
    }
    //4th level spells
    public static boolean nulFrost(boolean coldStat){
        if(!coldStat){
            coldStat = true;
        }
        return coldStat;
    }

    public static boolean antidote(boolean pStat){
        if(pStat){
            pStat = false;
        }
        return pStat;
    }

    public static int light(int level){
        int mult = (int)Math.floor((double) level / 2);

        return diceRolls.rollD8(mult);
    }

    public static power power(int str, int hp, int level){
        power p = new power();
        int plus = level * 2;
        p.setStr(str + 6);
        p.setHp(hp + plus);

        return p;
    }
    //5th level spells
    public static int cure3(int hp, int level){
        int plus = 0;
        if (level > 15){
            plus = 15;
        } else {
            plus = level;
        }

        int total = diceRolls.rollD8(3) + plus;
        hp = hp + total;

        return hp;
    }

    public static int harm3(int level) {
        int plus = 0;
        if (level > 15) {
            plus = 15;
        } else {
            plus = level;
        }

        return diceRolls.rollD8(3) + plus;
    }

    public static int flame(int level){
        return diceRolls.rollD6(level);
    }

    public static boolean blink(boolean blinkStat){
        if (!blinkStat){
            blinkStat = true;
        }

        return blinkStat;
    }
    //6th level spells
    public static hut hut(int hp, int mp, int maxHp, int maxMp, boolean blindStat, boolean pStat, int neg){
        hut h = new hut();
        h.setHp(hp = maxHp);
        h.setMp(mp = maxMp);
        h.setBlindStat(false);
        h.setPStat(false);
        h.setNeg(neg = 0);

        return h;
    }

    public static protect protect2(int ac, int fort, int ref, int will){
        protect p = new protect();
        p.setAc(ac + 4);
        p.setFort(fort + 4);
        p.setRef(ref + 4);
        p.setWill(will + 4);

        return p;
    }

    public static blades blades(boolean bladeStat, int level){
        blades b = new blades();
        if(!bladeStat){
            b.setBladeStat(true);
        }
        b.setDmg(diceRolls.rollD6(level));

        return b;
    }

    public static boolean command(boolean cStat, int intel, int will){
        int dc = (int)Math.floor((double)((intel - 10)/2)) + 6 + 10;
        int save = diceRolls.rollD20(1) + will;

        if(save < dc){
            cStat = true;
        } else {
            cStat = false;
        }
        return cStat;
    }
    //7th level spells
    public static int cure4(int hp, int level){
        int plus = 0;
        if (level > 20){
            plus = 20;
        } else {
            plus = level;
        }

        int total = diceRolls.rollD8(4) + plus;
        hp = hp + total;

        return hp;
    }

    public static int harm4(int level) {
        int plus = 0;
        if (level > 20) {
            plus = 20;
        } else {
            plus = level;
        }

        return diceRolls.rollD8(4) + plus;
    }

    public static boolean blind(boolean blindStat, int intel, int fort){
        int dc = (int) Math.floor((double) (intel - 10) /2) + 7 + 10;
        int save = diceRolls.rollD20(1) + fort;

        if(save < dc){
            blindStat = true;
        } else {
            blindStat = false;
        }
        return blindStat;
    }

    public static boolean nulDeath(boolean dStat){
        if(!dStat){
            dStat = true;
        }

        return dStat;
    }
    //8th level spells
    public static int holy(int level){
        int mult = (int)Math.floor((double)level/3);
        int plus = diceRolls.rollD8(mult);
        return diceRolls.rollD8(4) + plus;
    }

    public static resist resist(boolean shockStat, boolean fireStat, boolean coldStat){
        resist r = new resist();
        r.setShockStat(true);
        r.setFireStat(true);
        r.setColdStat(true);

        return r;
    }

    public static boolean death(boolean ko, int intel, int fort){
        int dc = (int) Math.floor((double) (intel - 10) /2) + 8 + 10;
        int save = diceRolls.rollD20(1) + fort;

        if(save < dc){
            ko = true;
        } else {
            ko = false;
        }
        return ko;
    }

    public static int drain(int neg){
        int total = diceRolls.rollD4(2);
        neg = neg - total;

        return neg;
    }
}
