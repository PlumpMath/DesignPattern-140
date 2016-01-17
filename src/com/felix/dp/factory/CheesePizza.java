package com.felix.dp.factory;

/**
 * Created by weatherfish on 16/1/10.
 */
public class CheesePizza extends AbstractPizza {


    @Override
    public void prepare() {
        super.setName("CheesePizza");
        System.out.println(name + " prepare");
    }
}
