public class Boat {

    public int size;
    public String color;
    public boolean hasSail;

    public Boat(int psize, String pcolor, boolean pSail){
        size = psize;
        color = pcolor;
        hasSail = pSail;
    }

    public void printInfo(){
        System.out.println("sail = " + hasSail);
        System.out.println("color = " + color);
        System.out.println("size = " + size);
        System.out.println();
    }

    public void repaint(String newColor){
        color = newColor;
    }

}
