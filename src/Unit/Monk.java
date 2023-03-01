package Unit;

public class Monk extends Character {

    String name;

    int manaMax = 30;
    int mana = manaMax;

    public Monk(int HP, int attack, int damageMin, int damageMax, int defend, int speed, String name, int manaMax, int mana) {
        super(HP, attack, damageMin, damageMax, defend, speed);
        this.name = name;
        this.manaMax = manaMax;
        this.mana = mana;

    }

    public Monk(String name){
        super(30,12,-4,-4,7,5);
        this.name = name;
        this.manaMax = manaMax;
        this.mana = mana;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Монах");
        return info.toString();
        }
    }


