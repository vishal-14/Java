package com.designpattern;

/**
 * 6.Implement Decorator pattern to decorate the Pizza with topings.
 */
interface pizza{
    String desc();
}

class  Pepperoni implements pizza{
    private String pep;

    public Pepperoni(String pep) {
        this.pep = pep;
    }

    public String getPep() {

        return pep;
    }

    public void setPep(String pep)
    {
        this.pep = pep;
    }
    public String desc(){
        return "Getting ready "+ pep+ " pizza";
    }
}

class Garlic implements pizza{
    private String val;

    public Garlic(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
    public String desc(){
        return "Getting ready "+ val+ " pizza";
    }
}

class TomatoSauce implements pizza {
    private pizza p;
    private String quantity;

    public TomatoSauce(pizza p,String val) {
        this.p=p;
        this.quantity = val;
    }

    public String getVal() {
        return quantity;
    }

    public void setVal(String val) {
        this.quantity = val;
    }

    @Override
    public String desc() {
        return (p.desc()+" with tomato sauce in " + quantity);
    }
}

class Mozzarellacheese implements pizza{
    private pizza p;
    private String quantity;

    public Mozzarellacheese(pizza p,String quantity) {
        this.p=p;
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    @Override
    public String desc() {
        return (p.desc()+" with Mozzarella Cheese in " + quantity);
    }

}
public class DecoratorPattern {
    public static void main(String[] args) {
        Pepperoni pizza1= new Pepperoni("Pepperoni");
        Garlic pizza2= new Garlic("Garlic");
        System.out.println(pizza1.desc());
        System.out.println(pizza2.desc());
        Mozzarellacheese pizza3= new Mozzarellacheese( new Pepperoni("Pepperoni"),"excess");
        System.out.println(pizza3.desc());
    }
}
