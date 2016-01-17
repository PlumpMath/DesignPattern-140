package com.felix.dp.factory.abstra;

import com.felix.dp.Utils;
import com.felix.dp.factory.IPizza;
import com.felix.dp.factory.methods.IPizzaFactory;

/**
 * Created by weatherfish on 16/1/10.
 */
public class LondonPizzaFactory implements IPizzaFactory {

    private IPizza pizza;

    @Override
    public IPizza createPizza() {
        if (Utils.getType().equals("Cheese")) {
            pizza = new LondonCheesePizza();
        } else if (Utils.getType().equals("Apple")) {
            pizza = new LondonApplePizza();
        }
        return pizza;
    }

}
