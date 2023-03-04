package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Character extends Coor implements GameInterface {

    protected int HP;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defend;
    protected int speed;

    String team;

    public Character(int HP, int attack, int damageMin, int damageMax, int defend, int speed,int posX,int posY,String team) {
        super(posX, posY);
        this.HP = HP;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defend = defend;
        this.speed = speed;
        this.posX = posX;
        this.posY = posY;
        this.team = team;
    }


    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return new Random().nextInt(damageMin,damageMax + 1 );
    }

    public int getDefend() {
        return defend;
    }

    public int getSpeed() {
        return speed;
    }
    public int step(ArrayList<Character> list, int a, int b){
        double x = a;
        double y = b;
        double help = 0;
        int target = 0;

        for (int i = 0; i < list.size(); i++) {
            double dist = Math.sqrt((list.get(i).getPosY()-  y)*(list.get(i).getPosY() - y)+ (list.get(i).getPosX()-  x)*(list.get(i).getPosX() - x));
            if (dist < help) {
                if (list.get(i).HP > 0) {
                    help = dist;
                    target = i;
                }
            }
            if (i == 0){help = dist;}

        }
        return target;


    }

}
