/**
 * Created by Adesh on 08-08-2019
 */

public class Main {
    public static void main(String[] args) {
        Hamburger bg = new Hamburger("Regular","chicken",180,"Brown Bread");

        bg.additn1("Extra cheese",40.20);
        bg.additn2("Extra Chicken",50.40);
        bg.additn3("Extra Mayo",20);
        double total = bg.addedBurger();
        System.out.println("*************************************************************************************");


        HealthyBurger hbg = new HealthyBurger("Chicken breast",210);
        hbg.HealthyAdd1("Egg white",30);
        hbg.HealthyAdd2("Spinach",20);
        double Htotal = hbg.addedBurger();
        System.out.println("*************************************************************************************");

        Meal meal = new Meal();
        meal.additn1("cheese",30);
        meal.addedBurger();
        System.out.println("*************************************************************************************");

    }
}
