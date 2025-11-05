package controller;

import model.*;

/**
 * De basiskoffie wordt "versiert" met melk, suiker en karamel en wrapt elkaar
 * als het ware.
 */

public class CoffeeLauncher {
    public static void main(String[] args) {

        Coffee milk = new MilkDecorator(new BasicCoffee());
        System.out.println(milk.getDescription());

        Coffee cappuccino = new MilkDecorator(new SugarDecorator(new BasicCoffee()));
        System.out.println(cappuccino.getDescription());

        Coffee latteMacchiato = new MilkDecorator(new CaramelDecorator(new BasicCoffee()));
        System.out.println(latteMacchiato.getDescription());



    }


}
