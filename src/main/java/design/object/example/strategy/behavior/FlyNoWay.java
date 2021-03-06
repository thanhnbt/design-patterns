package design.object.example.strategy.behavior;

/**
 * For creatures who aren't able to fly
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
