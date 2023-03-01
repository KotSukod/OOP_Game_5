package Unit;

public class Rogue extends Character{

    String name;

    public Rogue(int HP, int attack, int damageMin, int damageMax, int defend, int speed, String name) {
        super(HP, attack, damageMin, damageMax, defend, speed);
        this.name = name;
    }

    public Rogue(String name){
        super(10,8,2,4,3,6);
        this.name = name;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Разбойник");
        return info.toString();
    }
}

