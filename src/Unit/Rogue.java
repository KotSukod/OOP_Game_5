package Unit;

public class Rogue extends Character{

    String name;



    public Rogue(String name, Coor coor, String team){
        super(name,10,8,2,2,4,3,6, coor.posX, coor.posY,team);
        this.name = name;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();
        return info.append("Разбойник");
    }
}

