package com.felix.dp.factory.abstra;

import com.felix.dp.factory.AbstractPizza;

/**
 * Created by weatherfish on 16/1/10.
 */
public class LondonCheesePizza extends AbstractPizza {

    @Override
    public void prepare() {
        super.setName("LondonCheesePizza");
        System.out.println(name + " prepare");
    }
}
