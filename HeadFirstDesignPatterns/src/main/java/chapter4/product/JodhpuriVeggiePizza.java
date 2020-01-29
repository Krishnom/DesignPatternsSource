package chapter4.product;

public class JodhpuriVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Making jodhpur style veggie pizza");
        System.out.println("Making dough");
        System.out.println("Applying mirchi koota paste");
        System.out.println("Adding some cheese");
        System.out.println("Adding fresh tomatoes");
        System.out.println("Adding fresh chillies");
        System.out.println("Adding fresh onions");
        System.out.println("Baking");
    }

    @Override
    public void cut() {
        System.out.println("Cut into 4 slices");
    }

    @Override
    public void pack() {
        System.out.println("Pack in jodhpur pizza box");
    }
}
