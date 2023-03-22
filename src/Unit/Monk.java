package Unit;

import java.util.ArrayList;

public class Monk extends Character {

    String name;

    int manaMax = 30;
    int mana = manaMax;

    public Monk(String name,Coor coor,String team){
        super(name,30,12,10,-4,-4,7,5,coor.posX,coor.posY,team);
        this.name = name;
        this.manaMax = manaMax;
        this.mana = mana;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();
        return info.append("Монах");
    }
    @Override
    public int step(ArrayList<Character> list,Character character, int a, int b){
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


