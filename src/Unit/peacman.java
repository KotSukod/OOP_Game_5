package Unit;

public class peacman extends Character{

    String name;



    public peacman (String name, Coor coor,String team){
        super(name,10,6,3,1,3,5,4, coor.posX, coor.posY,team);
        this.name = name;
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();
        return info.append("Пикенер");
    }
}
