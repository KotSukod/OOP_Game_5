package Unit;

public class Peacant extends Character{

    String name;

    public Peacant (String name, Coor coor, String team){
        super(name,1,1,1,1,1,1,3, coor.posX, coor.posY,team);
        this.name = name;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();
        return info.append("Крестьянен");
    }


}

