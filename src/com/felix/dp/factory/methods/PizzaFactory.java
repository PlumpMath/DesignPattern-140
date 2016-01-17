package com.felix.dp.factory.methods;

import com.felix.dp.Utils;
import com.felix.dp.factory.ApplePizza;
import com.felix.dp.factory.CheesePizza;
import com.felix.dp.factory.IPizza;

/**
 * Created by weatherfish on 16/1/10.
 */
public class PizzaFactory implements IPizzaFactory {
    @Override
    public IPizza createPizza() {
        IPizza pizza = null;
        if (Utils.getType().equals("Cheese")) {
            pizza = new CheesePizza();
        } else if (Utils.getType().equals("Apple")) {
            pizza = new ApplePizza();
        }
        return pizza;
    }
}
