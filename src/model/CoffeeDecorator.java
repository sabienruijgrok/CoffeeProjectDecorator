package model;

/**
 * Definieert eerst een basis decorator door middel van een abstracte klasse
 */

abstract public class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

}
