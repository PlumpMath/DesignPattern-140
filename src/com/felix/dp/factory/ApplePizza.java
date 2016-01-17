package com.felix.dp.factory;

/**
 * Created by weatherfish on 16/1/10.
 */
public class ApplePizza extends AbstractPizza {
    @Override
    public void prepare() {
        super.setName("ApplePizza");
        System.out.println(name + " prepare");
    }
}
