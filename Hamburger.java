public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String Addition1Name;
    private double addition1Price;

    private String Addition2Name;
    private double addition2Price;

    private String Addition3Name;
    private double addition3Price;

    private String Addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1( String name, double price)
    {
        this.Addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2( String name, double price)
    {
        this.Addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3( String name, double price)
    {
        this.Addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4( String name, double price)
    {
        this.Addition4Name = name;
        this.addition4Price = price;
    }


    public double itemizeHamburger()
    {
        double hamburgerPrice = this.price;
        System.out.println(this.name +" hamburger"+ " on a "
        + this.breadRollType +" roll" +"price is " +this.price);

        if(this.Addition1Name != null)
        {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " +this.Addition1Name +
                     "for an extra " +this.addition1Price);
        }

        if(this.Addition2Name != null)
        {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " +this.Addition2Name +
                    "for an extra " +this.addition2Price);
        }

        if(this.Addition3Name != null)
        {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " +this.Addition3Name +
                    "for an extra " +this.addition3Price);
        }

        if(this.Addition4Name != null)
        {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " +this.Addition4Name +
                    "for an extra " +this.addition4Price);
        }

        return  hamburgerPrice;

    }









}
