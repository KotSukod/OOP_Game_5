package Unit;

public class peacman extends Character{

    String name;

    public peacman(int HP, int attack, int damageMin, int damageMax, int defend, int speed, int posX, int posY, String name,String team) {
        super(HP, attack, damageMin, damageMax, defend, speed, posX, posY,team);
        this.name = name;
    }

    public peacman (String name, int posX,int posY,String team){
        super(10,6,1,3,5,4, posX, posY,team);
        this.name = name;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Копейщик");
        return info.toString();
    }
}
