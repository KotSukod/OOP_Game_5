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
            int j = new Random().nextInt(1,5);
            if (j == 1){list_1.add(new Peacant(getName()));}
            if (j == 2){list_1.add(new Rogue(getName()));}
            if (j == 3){list_1.add(new Sniper(getName()));}
            if (j == 4){list_1.add(new Wizard(getName()));}
        }

        for (int i = 0; i < 10; i++) {
            int j = new Random().nextInt(1,5);
            if (j == 1){list_2.add(new Peacant(getName()));}
            if (j == 2){list_2.add(new peacman(getName()));}
            if (j == 3){list_2.add(new bowman(getName()));}
            if (j == 4){list_2.add(new Monk(getName()));}
        }

        list_3.addAll(list_1);
        list_3.addAll(list_2);

        Comparator<Character> sortBySpeed = Comparator.comparing(Character::getSpeed);

        list_3.sort(sortBySpeed);

        for (int i = 0; i < list_3.size(); i++) {
            System.out.println(list_3.get(i).getInfo());

        }



        }

    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }


}