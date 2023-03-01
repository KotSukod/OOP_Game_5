package Unit;

public class peacman extends Character{

    String name;

    public peacman(int HP, int attack, int damageMin, int damageMax, int defend, int speed, String name) {
        super(HP, attack, damageMin, damageMax, defend, speed);
        this.name = name;
    }

    public peacman (String name){
        super(10,4,1,3,5,4);
        this.name = name;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Копейщик");
        return info.toString();
    }
}
