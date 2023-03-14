package Unit;

public class Rogue extends Character{

    String name;

    public Rogue(int HP, int attack, int damageMin, int damageMax, int defend, int speed, int posX, int posY, String name,String team) {
        super(name,HP, attack, damageMin, damageMax, defend, speed, posX, posY,team);
        this.name = name;
    }

    public Rogue(String name, Coor coor, String team){
        super(name,10,8,2,4,3,6, coor.posX, coor.posY,team);
        this.name = name;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();
        return info.append("Разбойник");
    }
}

