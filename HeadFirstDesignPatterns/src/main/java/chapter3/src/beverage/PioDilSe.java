package chapter3.src.beverage;

public class PioDilSe {

    public static void main(String[] args) {
        /*Order up an GreenTea, no condiments
        and print its description and cost.*/
        Beverage beverage = new GreenTea();
        printDescription(beverage);
        /*
        Make an espresso with double mocha and honey and print description with cost
         */

        Beverage beverage1 = new Espresso();
        //Double mocha
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);

        //Add Honey
        beverage1 = new Honey(beverage1);

        //print description
        printDescription(beverage1);
    }

    static void printDescription(Beverage beverage){
        System.out.println(beverage.getDescription() + "\t\t" + beverage.cost() + "Rs ");
    }
}
