package Unit;

import java.util.Random;

public class bowman extends Character{

    String name;
    int shotMax = 16;
    int shot = shotMax;

    public bowman(int HP, int attack, int damageMin, int damageMax, int defend, int speed, int posX, int posY, String name, int shotMax, int shot,String team) {
        super(HP, attack, damageMin, damageMax, defend, speed, posX, posY,team);
        this.name = name;
        this.shotMax = shotMax;
        this.shot = shot;
    }



    public bowman (String name, int posX,int posY,String team){
        super(10,6,2,3,3,4, posX, posY,team);
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
