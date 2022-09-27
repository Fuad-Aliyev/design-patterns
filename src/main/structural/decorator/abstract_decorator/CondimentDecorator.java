package main.structural.decorator;

public abstract class CondimentDecorator extends Beverage {
    public abstract String gedDescription();

    @Override
    public double cost() {
        return 0;
    }
}
