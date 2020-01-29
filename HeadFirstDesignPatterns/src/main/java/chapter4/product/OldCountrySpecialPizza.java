package chapter4.product;

public class OldCountrySpecialPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("We are closed");
    }

    @Override
    public void cut() {
        System.out.println("We are closed");
    }

    @Override
    public void pack() {
        System.out.println("We are closed");
    }
}
