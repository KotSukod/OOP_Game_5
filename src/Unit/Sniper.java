package Unit;

public class Sniper extends Character{

    String name;
    int shotMax = 32;
    int shot = shotMax;

    public Sniper(int HP, int attack, int damageMin, int damageMax, int defend, int speed, String name, int shotMax, int shot) {
        super(HP, attack, damageMin, damageMax, defend, speed);
        this.name = name;
        this.shotMax = shotMax;
        this.shot = shot;
    }

    public Sniper(String name){
        super(15,12,8,10,10,9);
        this.name = name;
        this.shotMax = shotMax;
        this.shot = shot;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Снайпер");
        return info.toString();
    }
}

