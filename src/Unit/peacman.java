package Unit;

public class peacman extends Character{

    String name;

    public peacman(int HP, int attack, int damageMin, int damageMax, int defend, int speed, int posX, int posY, String name,String team) {
        super(name,HP, attack, damageMin, damageMax, defend, speed, posX, posY,team);
        this.name = name;
    }

    public peacman (String name, Coor coor,String team){
        super(name,10,6,1,3,5,4, coor.posX, coor.posY,team);
        this.name = name;
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();
        return info.append("Пикенер");
    }
}
