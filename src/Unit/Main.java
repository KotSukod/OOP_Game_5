package Unit;

import java.util.*;


public class Main {


    public static void main(String[] args){

       // Monk monk = new Monk("Kristofer");
       // bowman bowman = new bowman("Kristofer");
       // Peacant peacant = new Peacant("Kristofer");
       // peacman peacman = new peacman("Kristofer");
       // Rogue rogue = new Rogue("Kristofer");
       // Sniper sniper = new Sniper("Kristofer");
       // Wizard wizard = new Wizard("Kristofer");

        ArrayList<Character> list_1 = new ArrayList<>();
        ArrayList<Character> list_2 = new ArrayList<>();
        ArrayList<Character> list_3 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int j = new Random().nextInt(1,8);
            if (j == 1){list_1.add(new bowman(getName(),i,1,"team1"));}
            if (j == 2){list_1.add(new Monk(getName(),i,1,"team1"));}
            if (j == 3){list_1.add(new Peacant(getName(),i,1,"team1"));}
            if (j == 4){list_1.add(new peacman(getName(),i,1,"team1"));}
            if (j == 5){list_1.add(new Rogue(getName(),i,1,"team1"));}
            if (j == 6){list_1.add(new Sniper(getName(),i,1,"team1"));}
            if (j == 7){list_1.add(new Wizard(getName(),i,1,"team1"));}
        }

        for (int i = 0; i < 10; i++) {
            int j = new Random().nextInt(1,8);
            if (j == 1){list_2.add(new bowman(getName(),i,5,"team2"));}
            if (j == 2){list_2.add(new Monk(getName(),i,5,"team2"));}
            if (j == 3){list_2.add(new Peacant(getName(),i,5,"team2"));}
            if (j == 4){list_2.add(new peacman(getName(),i,5,"team2"));}
            if (j == 5){list_2.add(new Rogue(getName(),i,5,"team2"));}
            if (j == 6){list_2.add(new Sniper(getName(),i,5,"team2"));}
            if (j == 7){list_2.add(new Wizard(getName(),i,5,"team2"));}
        }

        list_3.addAll(list_1);
        list_3.addAll(list_2);

        Comparator<Character> sortBySpeed = Comparator.comparing(Character::getSpeed);

        list_3.sort(sortBySpeed);

        for (int i = 0; i < list_3.size(); i++) {

            int target = 0;
            int HP = 0;
            if (list_3.get(i).HP > 0) {

                if (list_3.get(i).team == "team1") {

                    if (list_3.get(i).getClass() == Monk.class || list_3.get(i).getClass() == Wizard.class) {

                        target = list_3.get(i).step(list_1, list_3.get(i).getPosX(), list_3.get(i).getPosY());
                        list_1.get(target).setHP(list_1.get(target).HP - list_3.get(i).getAttack());
                    }
                    target = list_3.get(i).step(list_2, list_3.get(i).getPosX(), list_3.get(i).getPosY());
                    list_2.get(target).setHP(list_2.get(target).HP - list_3.get(i).getAttack());
                }
                if (list_3.get(i).team == "team2") {

                    if (list_3.get(i).getClass() == Monk.class || list_3.get(i).getClass() == Wizard.class) {
                        target = list_3.get(i).step(list_1, list_3.get(i).getPosX(), list_3.get(i).getPosY());
                        list_2.get(target).setHP(list_2.get(target).HP - list_3.get(i).getAttack());
                    }
                    target = list_3.get(i).step(list_1, list_3.get(i).getPosX(), list_3.get(i).getPosY());
                    list_1.get(target).setHP(list_1.get(target).HP - list_3.get(i).getAttack());
                }

            }
        }



        }





    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }


}