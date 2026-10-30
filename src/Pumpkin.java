public class Pumpkin {

    public int size;
    public boolean isJackolantern;
    public String color;

    public Pumpkin(int pSize, String pcolor, boolean pJackolantern){
        color = pcolor;
        size = pSize;
        isJackolantern = pJackolantern;
    }

    public void printInfo(){
        System.out.println("jackolantern = " + isJackolantern);
        System.out.println("color = " + color);
        System.out.println("size = " + size);
        System.out.println();
    }
}