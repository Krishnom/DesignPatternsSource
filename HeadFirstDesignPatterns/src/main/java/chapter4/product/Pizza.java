package chapter4.product;

import java.util.Arrays;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;

    public abstract void prepare();

    public void cut(){
        System.out.println("Cutting in 4 slices");
    }
    public void pack(){
        System.out.println("Packing in classic pizza box for delivery");
    }

    public void bake(){
        System.out.println("Its baking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                '}';
    }
}
