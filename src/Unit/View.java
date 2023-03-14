package Unit;

import java.util.Collection;
import java.util.Collections;

public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9,formatDiv("-b"))) + formatDiv("-c");
    private static final String mid10 = formatDiv("d") + String.join("",Collections.nCopies(9,formatDiv("-e"))) + formatDiv("-f");
    private static final String bootom10 = formatDiv("g") + String.join("",Collections.nCopies(9,formatDiv("-h"))) + formatDiv("-i");
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 2;
        if (dif > 0) System.out.printf("%" + dif + "s", ":\t"); else System.out.println(":\t");
            }



    private static String formatDiv(String str){
        return str.replace('a','\u250c')
                  .replace('b','\u252c')
                  .replace('c','\u2510')
                  .replace('d','\u251c')
                .replace('e','\u253c')
                .replace('f','\u2524')
                .replace('g','\u2514')
                .replace('h','\u2534')
                .replace('i','\u2518')
                .replace('-','\u2500');
    }

    private static String getChar (int x, int y){
         String out = "| ";
         for (Character character: Main.list_3){
             if (character.getCoords()[0] == x && character.getCoords()[1] == y){
                 if (character.getHP() == 0 || character.getHP() < 0){
                     out = "|" + (Color.ANSI_RED + character.getInfo().charAt(0) + Color.ANSI_RESET);
                    break;
                 }
                 if (Main.list_1.contains(character)) out = "|" + (Color.ANSI_GREEN + character.getInfo().charAt(0) + Color.ANSI_RESET);
                 if (Main.list_2.contains(character)) out = "|" + (Color.ANSI_BLUE + character.getInfo().charAt(0) + Color.ANSI_RESET);
                 break;
             }
         }
         return out;
    }

    public static void veiw(){
        if (step == 1){
            System.out.println(Color.ANSI_RED + "Fist Step" + Color.ANSI_RESET);
        } else{
            System.out.println(Color.ANSI_RED + "Step" + step + Color.ANSI_RESET);
        }
        step++;
        Main.list_3.forEach((v)->l[0] = Math.max(l[0],v.toString().length()));
        for (int i = 0; i < l[0]*2; i++) System.out.print("_");
        System.out.println("");
        System.out.print(top10 + "   ");
        System.out.print("Team 1");
        for (int i = 0; i < l[0]-9; i++) System.out.print(" ");
        System.out.println(":\tTeam 2");
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1,i));
        }
        System.out.print("|    ");
        if (Main.list_1.get(0).HP <= 0){
            System.out.print("Dead");
        }else {
        System.out.print(Main.list_1.get(0));}
        tabSetter(Main.list_1.get(0).toString().length(),l[0]);
        System.out.println(Main.list_2.get(0));
        System.out.println(mid10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i,j));
            }
            System.out.print("|    ");
            if (Main.list_1.get(i-1).HP <= 0){
                System.out.print("Dead");
            }else {
                System.out.print(Main.list_1.get(i-1));}
            //System.out.print(Main.list_1.get(i-1));
            tabSetter(Main.list_1.get(i-1).toString().length(),l[0]);
            if (Main.list_2.get(i-1).HP <= 0){
                System.out.println("Dead");
            }else {
                System.out.println(Main.list_2.get(i - 1));
            }
            System.out.println(mid10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10,j));
        }
        System.out.print("|    ");
        System.out.print(Main.list_1.get(9));
        tabSetter(Main.list_1.get(9).toString().length(),l[0]);
        System.out.println(Main.list_2.get(9));
        System.out.println(bootom10);
        }
    }






