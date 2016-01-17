package com.felix.dp.factory.abstra;

import com.felix.dp.Utils;
import com.felix.dp.factory.IPizza;
import com.felix.dp.factory.methods.IPizzaFactory;

/**
 * Created by weatherfish on 16/1/10.
 */
public class NewYorkPizzaFactory implements IPizzaFactory {

    @Override
    public IPizza createPizza() {
        IPizza pizza = null;
        if (Utils.getType().equals("Cheese")) {
            pizza = new NewYorkCheesePizza();
        } else if (Utils.getType().equals("Apple")) {
            pizza = new NewYorkApplePizza();
        }
        return pizza;
    }
}
