package Unit;

public class bowman extends Character{

    String name;
    int shotMax = 16;
    int shot = shotMax;

    public bowman(int HP, int attack, int damageMin, int damageMax, int defend, int speed, String name, int shotMax, int shot) {
        super(HP, attack, damageMin, damageMax, defend, speed);
        this.name = name;
        this.shotMax = shotMax;
        this.shot = shot;
    }

    public bowman (String name){
        super(10,6,2,3,3,4);
        this.name = name;
        this.shotMax = shotMax;
        this.shot = shot;

    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Арбалетчик");
        return info.toString();
    }
}
