package chapter1;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        //can't quack:
        System.out.println("<<  Silence  >>");
    }
}
