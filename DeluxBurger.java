public class DeluxBurger extends Hamburger{

    public DeluxBurger(){
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot add additions items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot add additions items to a deluxe burger");

    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot add additions items to a deluxe burger");

    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        super.addHamburgerAddition4(name, price);
    }
}
