package com.felix.dp.strategy2;

import com.felix.dp.strategy2.fly.NoFlyBehavior;
import com.felix.dp.strategy2.quack.GeGeQuackBehavior;

/**
 * Created by weatherfish on 16/1/10.
 */
public class BigYellowDuck extends Duck {

    public BigYellowDuck() {
        super();
        super.setFlyBehavior(new NoFlyBehavior());
        super.setQuackBehavior(new GeGeQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("**** Big Yellow ****");
        super.fly();
        super.quack();
    }
}
