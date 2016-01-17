package com.felix.dp.factory.abstra;

import com.felix.dp.factory.AbstractPizza;

/**
 * Created by weatherfish on 16/1/10.
 */
public class LondonApplePizza extends AbstractPizza {

    @Override
    public void prepare() {
        super.setName("LondonApplePizza");
        System.out.println(name + " prepare");
    }

}
