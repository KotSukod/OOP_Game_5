package Unit;

public class Peacant extends Character{

    String name;

    public Peacant(int HP, int attack, int damageMin, int damageMax, int defend, int speed, String name) {
        super(HP, attack, damageMin, damageMax, defend, speed);
        this.name = name;
    }

    public Peacant (String name){
        super(1,1,1,1,1,3);
        this.name = name;
    }
    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Крестьянен");
        return info.toString();
    }
}

