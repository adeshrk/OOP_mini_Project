/**
 * Created by Adesh on 08-08-2019
 */

public class HealthyBurger extends Hamburger{

    private String HealthyAddname1;
    private double HealthyAddprice1;

    private String HealthyAddname2;
    private double HealthyAddprice2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Bread");
    }

    public void HealthyAdd1(String name,double price){
        this.HealthyAddname1 = name;
        this.HealthyAddprice1 = price;
    }

    public void HealthyAdd2(String name,double price){
        this.HealthyAddname2 = name;
        this.HealthyAddprice2 = price;
    }

    @Override
    public double addedBurger() {
        double HealthyPrice = super.addedBurger();
        if(this.HealthyAddname1 != null){
            HealthyPrice +=this.HealthyAddprice1;
            System.out.println("Total price after Addition of "+this.HealthyAddname1+" for an extra Rs."+this.HealthyAddprice1+" -> "+HealthyPrice);
        }

        if(this.HealthyAddname2 != null){
            HealthyPrice +=this.HealthyAddprice2;
            System.out.println("Total price after Addition of "+this.HealthyAddname2+" for an extra Rs."+this.HealthyAddprice2+" -> "+HealthyPrice);
        }

        return HealthyPrice;
    }


}
