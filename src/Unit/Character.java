package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Character extends Coor implements GameInterface {
    protected String name;
    protected int HP;
    protected int attack;
    protected int rangeAttack;
    protected int damageMin;
    protected int damageMax;
    protected int defend;
    protected int speed;
    protected Coor coords;
    String team;

    public Character(String name,int HP, int attack, int rangeAttack, int damageMin, int damageMax, int defend, int speed,int posX,int posY,String team) {
        super(posX, posY);
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.rangeAttack = rangeAttack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defend = defend;
        this.speed = speed;
        this.team = team;
        coords = new Coor(posX,posY);
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

    public int[] getCoords (){return new int[]{coords.posX, coords.posY};}

    public int getDefend() {
        return defend;
    }

    public int getSpeed() {
        return speed;
    }
    public int
    step(ArrayList<Character> list, Character character, int a, int b){
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
        if (help > character.rangeAttack){
            if (list.get(target).coords.posX !=character.posX){
                return 12;
            }else return 11;

        }else return target;

    }

    @Override
    public StringBuilder getInfo() {
        return new StringBuilder("");
    }


    @Override
    public String toString() {
        return name +
                " H:" + Math.round(HP) +
                " D:" + defend +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2));
    }
}


