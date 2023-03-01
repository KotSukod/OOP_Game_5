package Unit;

public class Wizard extends Character{

    String name;
    int manaMax = 30;
    int mana = manaMax;

    public Wizard(int HP, int attack, int damageMin, int damageMax, int defend, int speed, String name, int manaMax, int mana) {
        super(HP, attack, damageMin, damageMax, defend, speed);
        this.name = name;
        this.manaMax = manaMax;
        this.mana = mana;
    }

    public Wizard(String name){
        super(30,17,-5,-5,12,9);
        this.name = name;
        this.manaMax = manaMax;
        this.mana = mana;

    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Колдун");
        return info.toString();
    }
}
