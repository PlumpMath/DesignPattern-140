package com.felix.dp.strategy2;

import com.felix.dp.strategy2.fly.GoodFlyBehavior;
import com.felix.dp.strategy2.quack.GaGaQuackBehavior;

/**
 * Created by weatherfish on 16/1/10.
 */
public class SmallRedDuck extends Duck {

    public SmallRedDuck() {
        super();
        super.setFlyBehavior(new GoodFlyBehavior());
        super.setQuackBehavior(new GaGaQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("**** Small Red ****");
        super.fly();
        super.quack();
    }
}
