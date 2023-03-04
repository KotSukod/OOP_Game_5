package Unit;

public class Peacant extends Character{

    String name;

    public Peacant(int HP, int attack, int damageMin, int damageMax, int defend, int speed, int posX, int posY, String name,String team) {
        super(HP, attack, damageMin, damageMax, defend, speed, posX, posY, team);
        this.name = name;
    }

    public Peacant (String name, int posX,int posY, String team){
        super(1,1,1,1,1,3, posX, posY,team);
        this.name = name;
    }
    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Крестьянен");
        return info.toString();
    }
}

