package Unit;

import java.util.*;


public class Main {

    public static  ArrayList<Character> list_3 = new ArrayList<>();

    public  static ArrayList<Character> list_1 = new ArrayList<>();
    public  static ArrayList<Character> list_2 = new ArrayList<>();


    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to continue");
        user_input.nextLine();
        for (int i = 0; i < 10; i++) {
            int j = new Random().nextInt(1, 8);
            if (j == 1) {
                list_1.add(new bowman(getName(), new Coor(i+1,1), "team1"));
            }
            if (j == 2) {
                list_1.add(new Monk(getName(), new Coor(i+1,1), "team1"));
            }
            if (j == 3) {
                list_1.add(new Peacant(getName(),new Coor(i+1,1), "team1"));
            }
            if (j == 4) {
                list_1.add(new peacman(getName(), new Coor(i+1,1), "team1"));
            }
            if (j == 5) {
                list_1.add(new Rogue(getName(), new Coor(i+1,1), "team1"));
            }
            if (j == 6) {
                list_1.add(new Sniper(getName(),new Coor(i+1,1), "team1"));
            }
            if (j == 7) {
                list_1.add(new Wizard(getName(),new Coor(i+1,1), "team1"));
            }
        }
        for (int i = 0; i < 10; i++) {
            int j = new Random().nextInt(1, 8);
            if (j == 1) {
                list_2.add(new bowman(getName(),new Coor(i+1,10), "team2"));
            }
            if (j == 2) {
                list_2.add(new Monk(getName(),new Coor(i+1,10), "team2"));
            }
            if (j == 3) {
                list_2.add(new Peacant(getName(),new Coor(i+1,10), "team2"));
            }
            if (j == 4) {
                list_2.add(new peacman(getName(),new Coor(i+1,10), "team2"));
            }
            if (j == 5) {
                list_2.add(new Rogue(getName(),new Coor(i+1,10), "team2"));
            }
            if (j == 6) {
                list_2.add(new Sniper(getName(),new Coor(i+1,10), "team2"));
            }
            if (j == 7) {
                list_2.add(new Wizard(getName(), new Coor(i+1,10), "team2"));
            }
        }
        list_3.addAll(list_1);
        list_3.addAll(list_2);
        Comparator<Character> sortBySpeed = Comparator.comparing(Character::getSpeed);
        list_3.sort(sortBySpeed);
        while (list_1.size() > 0 && list_2.size() > 0) {
            View.veiw();
            user_input.nextLine();
            getTurn(list_1, list_2,list_3);

        }

    }
    public static void  getTurn(ArrayList<Character> list_1, ArrayList<Character> list_2,ArrayList<Character> list_3){

            for (int i = 0; i < list_3.size(); i++) {

                int target = 0;
                int HP = 0;
                if (list_3.get(i).HP > 0) {

                    if (list_3.get(i).team == "team1") {

                        if (list_3.get(i).getClass() == Monk.class || list_3.get(i).getClass() == Wizard.class) {

                            target = list_3.get(i).step(list_1,list_3.get(i), list_3.get(i).getPosX(), list_3.get(i).getPosY());
                            int attack = list_3.get(i).getAttack();
                            list_1.get(target).setHP(list_1.get(target).HP - attack);
                            System.out.println(list_3.get(i).name + " лечит " + list_1.get(target).name + " на " + attack );
                        } else {
                            target = list_3.get(i).step(list_2,list_3.get(i), list_3.get(i).getPosX(), list_3.get(i).getPosY());
                            if (target == 11){
                                list_3.get(i).coords.posY += 1;
                            }else {
                                int attack = list_3.get(i).getAttack();
                                list_2.get(target).setHP(list_2.get(target).HP - list_3.get(i).getAttack());
                                System.out.println(list_3.get(i).name + " атакует " + list_2.get(target).name + " на " + attack);
                            }
                        }
                    }
                    if (list_3.get(i).team == "team2") {

                        if (list_3.get(i).getClass() == Monk.class || list_3.get(i).getClass() == Wizard.class) {
                            target = list_3.get(i).step(list_2,list_3.get(i), list_3.get(i).getPosX(), list_3.get(i).getPosY());
                            int attack = list_3.get(i).getAttack();
                            list_2.get(target).setHP(list_2.get(target).HP - list_3.get(i).getAttack());
                            System.out.println(list_3.get(i).name + " лечит " + list_2.get(target).name + " на " + attack );
                        } else {
                            target = list_3.get(i).step(list_1,list_3.get(i), list_3.get(i).getPosX(), list_3.get(i).getPosY());
                            if (target == 11) {
                                list_3.get(i).coords.posY -= 1;
                            }else {
                                int attack = list_3.get(i).getAttack();
                                list_1.get(target).setHP(list_1.get(target).HP - list_3.get(i).getAttack());
                                System.out.println(list_3.get(i).name + " атакует " + list_1.get(target).name + " на " + attack);
                            }
                        }
                    }

                }
            }
        }


    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }


}