public class Main {
    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("basic", "sausage", 3.56,"white");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("letturce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        price = hamburger.itemizeHamburger();

        System.out.println("Total burger price : " +price);

        healthyBurger HealthyBurger = new healthyBurger("Bacon", 5.67);

        HealthyBurger.addHamburgerAddition1("egg", 5.43);

        HealthyBurger.addHealthAddition1("Lentils", 3.43);
        System.out.println("Total price is " +HealthyBurger.itemizeHamburger() );

        DeluxBurger db =  new DeluxBurger();
        System.out.println(db.itemizeHamburger());
        db.addHamburgerAddition1("you cannot have", 5);
        System.out.println(db.itemizeHamburger());
    }



    public static void mbledhja (int number1, int number2){
        System.out.println(number2*number1);
    }
}