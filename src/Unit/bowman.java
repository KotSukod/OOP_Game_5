package Unit;

import java.util.Random;

public class bowman extends Character{

    int shotMax = 16;
    int shot = shotMax;

    public bowman (String name, Coor coor,String team){
        super(name,10,6,10,2,3,3,4, coor.posX, coor.posY,team);
        this.name = name;
        this.shotMax = shotMax;
        this.shot = shot;

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();
        return info.append("Арбалетчик");
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
