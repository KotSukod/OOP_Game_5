package Unit;

public abstract class Character implements GameInterface {

    protected int HP;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defend;
    protected int speed;

    public Character(int HP, int attack, int damageMin, int damageMax, int defend, int speed) {
        this.HP = HP;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defend = defend;
        this.speed = speed;
    }


    public int getHP() {
        return HP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefend() {
        return defend;
    }

    public int getSpeed() {
        return speed;
    }


}
