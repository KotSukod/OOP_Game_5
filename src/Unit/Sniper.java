package Unit;

import java.util.Random;

public class Sniper extends Character{

    String name;
    int shotMax = 32;
    int shot = shotMax;

    public Sniper(int HP, int attack, int damageMin, int damageMax, int defend, int speed, int posX, int posY, String name, int shotMax, int shot,String team) {
        super(HP, attack, damageMin, damageMax, defend, speed, posX, posY,team);
        this.name = name;
        this.shotMax = shotMax;
        this.shot = shot;
    }

    public Sniper(String name, int posX,int posY, String team){
        super(15,12,8,10,10,9, posX, posY,team);
        this.name = name;
        this.shotMax = shotMax;
        this.shot = shot;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(name);
        return info.toString();
    }

    @Override
    public int getAttack() {
        if (shot > 0) {
            shot -= 1;
            return new Random().nextInt(damageMin, damageMax + 1);
        }
        return 0;
    }
}

