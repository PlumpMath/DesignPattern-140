package com.felix.dp.factory.simple;

import com.felix.dp.factory.ApplePizza;
import com.felix.dp.factory.CheesePizza;
import com.felix.dp.factory.IPizza;

/**
 * Created by weatherfish on 16/1/10.
 */
public class SimplePizzaFactory {

    public static IPizza createPizza(String type) {
        IPizza pizza = null;
        switch (type) {
            case "Cheese":
                pizza = new CheesePizza();
                break;
            case "Apple":
                pizza = new ApplePizza();
                break;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.boxing();
        return pizza;
    }
}
