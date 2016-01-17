package com.felix.dp.factory.abstra;

import com.felix.dp.factory.AbstractPizza;

/**
 * Created by weatherfish on 16/1/10.
 */
public class NewYorkCheesePizza extends AbstractPizza {

    @Override
    public void prepare() {
        super.setName("NewYorkCheesePizza");
        System.out.println(name + " prepare");
    }
}
