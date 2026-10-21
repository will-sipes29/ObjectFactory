public class Factory {

    // instance variables; always use public
    public boolean isOpen = true;
    public int yearFounded = 2000;

    // string; holds words and punctuation using quotes
    public String owner = "Will";

    public Pumpkin pumpkin1;
    public Pumpkin pumpkin2;
    public Pumpkin pumpkin3;


    public static void main(String[] args) {
        Factory a = new Factory();
    }

    public Factory(){

        System.out.println("Welcome to Will's factory");
        System.out.println("The year founded is " + yearFounded);
        System.out.println("it is " + isOpen + " that the factory is open");
        System.out.println("The owner is " + owner);
        System.out.println();

        pumpkin1 = new Pumpkin();
        System.out.println("jackolantern = " + pumpkin1.isJackolantern);
        System.out.println(pumpkin1.color);
        System.out.println(pumpkin1.size);

        pumpkin2 = new Pumpkin();
        pumpkin2.color = "blue";
        System.out.println(pumpkin2.color);
        pumpkin2.size = pumpkin1.size * 2;
        System.out.println(pumpkin2.size);

        pumpkin3 = new Pumpkin();
        pumpkin3.color = "green";
        System.out.println(pumpkin3.color);
        pumpkin3.size = pumpkin1.size * 3;
        System.out.println(pumpkin3.size);
    }
}
