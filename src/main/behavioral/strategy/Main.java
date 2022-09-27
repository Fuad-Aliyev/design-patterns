package main.strategy;

import main.strategy.behavior.fly.FlyWithWings;
import main.strategy.behavior.quack.MuteQuack;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new MuteQuack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
