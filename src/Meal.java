/**
 * Created by Adesh on 08-08-2019
 */

public class Meal extends Hamburger {
    public Meal() {
        super("Delux", "Mutton", 230, "White Bread");
        super.additn1("chips",40);
        super.additn2("Coke",50);
    }

    @Override
    public void additn1(String name, double price) {
        System.out.println("Additions ("+name+") are not allowed in Meal :(\nYou can still Enjoy your burger with Chips and Drink ;)\n");
    }

    @Override
    public void additn2(String name, double price) {
        System.out.println("Additions ("+name+") are not allowed in Meal :(\nYou can still Enjoy your burger with Chips and Drink ;)\n");

    }

    @Override
    public void additn3(String name, double price) {
        System.out.println("Additions ("+name+") are not allowed in Meal :(\nYou can still Enjoy your burger with Chips and Drink ;)\n");
    }

    @Override
    public void additn4(String name, double price) {
        System.out.println("Additions ("+name+") are not allowed in Meal :(\nYou can still Enjoy your burger with Chips and Drink ;)\n");

    }
}
