package Unit;

import java.util.ArrayList;

public class Monk extends Character {

    String name;

    int manaMax = 30;
    int mana = manaMax;

    public Monk(int HP, int attack, int damageMin, int damageMax, int defend, int speed, int posX, int posY, String name, int manaMax, int mana, String team) {
        super(HP, attack, damageMin, damageMax, defend, speed, posX, posY, team);
        this.name = name;
        this.manaMax = manaMax;
        this.mana = mana;
    }

    public Monk(String name,int posX, int posY,String team){
        super(30,12,-4,-4,7,5,posX,posY,team);
        this.name = name;
        this.manaMax = manaMax;
        this.mana = mana;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(name);
        return info.toString();
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


