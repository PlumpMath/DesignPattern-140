package com.felix.dp.factory;

import com.felix.dp.factory.abstra.NewYorkPizzaFactory;
import com.felix.dp.factory.methods.PizzaFactory;
import com.felix.dp.factory.simple.SimplePizzaFactory;

/**
 * Created by weatherfish on 16/1/10.
 */
public class PizzaStore {
    public static void main(String[] args) {
        testFactoryMethod();
    }

    public static void testSimpleFactory() {
        IPizza pizza = SimplePizzaFactory.createPizza("Apple");
    }

    public static void testFactoryMethod() {
        new PizzaFactory().createPizza().done();
    }

    public static void testAbsFactory(){
        new NewYorkPizzaFactory().createPizza().done();
    }
}
