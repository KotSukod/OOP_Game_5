package Unit;

public class Coor {

    protected int posX;
    protected int posY;

    public Coor(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX(){
        return posX;
    }
    public int getPosY(){
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

}
