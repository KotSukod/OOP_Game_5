package Unit;

import java.util.ArrayList;

public class Wizard extends Character{

    String name;
    int manaMax = 30;
    int mana = manaMax;

    public Wizard(int HP, int attack, int damageMin, int damageMax, int defend, int speed, int posX, int posY, String name, int manaMax, int mana,String team)  {
        super(name,HP, attack, damageMin, damageMax, defend, speed, posX, posY,team);
        this.name = name;
        this.manaMax = manaMax;
        this.mana = mana;
    }

    public Wizard(String name, Coor coor,String team){
        super(name,30,17,-5,-5,12,9, coor.posX, coor.posY,team);
        this.name = name;
        this.manaMax = manaMax;
        this.mana = mana;

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();
        return info.append("Маг");
    }

    @Override
    public int step(ArrayList<Character> list, int a, int b){
        int target = 0;

        for (int i = 0; i < list.size(); i++) {
            int HP = 0;
            if (list.get(i).HP < HP){
                target = i;
            }
            if (i ==0){HP = list.get(i).HP;}
        }

        return target;
    }
}
