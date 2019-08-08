/**
 * Created by Adesh on 08-08-2019
 */

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadtype;

    private String add1;
    private  double addPrice1;
    private String add2;
    private  double addPrice2;
    private String add3;
    private  double addPrice3;
    private String add4;
    private  double addPrice4;

    public Hamburger(String name, String meat, double price, String breadtype) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadtype = breadtype;
    }

    public void additn1(String name, double price){
        this.add1 = name;
        this.addPrice1 = price;
    }

    public void additn2(String name, double price){
        this.add2 = name;
        this.addPrice2 = price;
    }

    public void additn3(String name, double price){
        this.add3 = name;
        this.addPrice3 = price;
    }

    public void additn4(String name, double price){
        this.add4 = name;
        this.addPrice4 = price;
    }

    public double addedBurger(){
        double burgerPrice=this.price;
        System.out.println(this.name+" Burger on a "+this.breadtype+
                ", Price is "+this.price);

        if(this.add1 !=null){
            burgerPrice+=this.addPrice1;
            System.out.println("Total price after Addition of "+this.add1+" for an extra Rs."+this.addPrice1+" -> "+burgerPrice);
        }

        if(this.add2 !=null){
            burgerPrice+=this.addPrice2;
            System.out.println("Total price after Addition of "+this.add2+" for an extra Rs."+this.addPrice2+" -> "+burgerPrice);
        }

        if(this.add3 !=null){
            burgerPrice+=this.addPrice3;
            System.out.println("Total price after Addition of "+this.add3+" for an extra Rs."+this.addPrice3+" -> "+burgerPrice);
        }

        if(this.add4 !=null){
            burgerPrice = burgerPrice + this.addPrice4;
            System.out.println("Total price after Addition of "+this.add4+" for an extra Rs."+this.addPrice4+" -> "+burgerPrice);
        }

        return burgerPrice;
    }




}
