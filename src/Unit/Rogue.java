package Unit;

public class Rogue extends Character{

    String name;

    public Rogue(int HP, int attack, int damageMin, int damageMax, int defend, int speed, int posX, int posY, String name,String team) {
        super(HP, attack, damageMin, damageMax, defend, speed, posX, posY,team);
        this.name = name;
    }

    public Rogue(String name, int posX,int posY, String team){
        super(10,8,2,4,3,6, posX, posY,team);
        this.name = name;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(name);
        return info.toString();
    }
}

