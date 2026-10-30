public class Factory {

    // instance variables; always use public
    public boolean isOpen = true;
    public int yearFounded = 2000;

    // string; holds words and punctuation using quotes
    public String owner = "Will";

    public Pumpkin pumpkin1;
    public Pumpkin pumpkin2;
    public Pumpkin pumpkin3;
    public Boat sailboat;

    public int randSize;

    public static void main(String[] args) {
        Factory a = new Factory();
    }

    public Factory(){

        System.out.println("Welcome to Will's factory");
        System.out.println("The year founded is " + yearFounded);
        System.out.println("it is " + isOpen + " that the factory is open");
        System.out.println("The owner is " + owner);
        System.out.println();

        pumpkin1 = new Pumpkin(30, "orange", true);
        System.out.println("pumpkin1");
        pumpkin1.printInfo();

        randSize = (int)(Math.random() * 101);

        pumpkin2 = new Pumpkin(randSize, "purple", false);
        System.out.println("pumpkin2");
        pumpkin2.printInfo();

        pumpkin3 = new Pumpkin(70, "green", false);
        System.out.println("pumpkin3");
        pumpkin3.printInfo();

        sailboat = new Boat(70, "blue",true);
        System.out.println("sailboat");
        sailboat.printInfo();
    }
}
