package com.felix.dp.strategy2;

import com.felix.dp.strategy2.fly.BadFlyBehavior;
import com.felix.dp.strategy2.quack.NoQuackBehavior;

/**
 * Created by weatherfish on 16/1/10.
 */
public class StrategyTest2 {
    public static void main(String[] args) {
        Duck byd = new BigYellowDuck();
        Duck srd = new SmallRedDuck();

        byd.display();

        srd.setFlyBehavior(new BadFlyBehavior());
        srd.setQuackBehavior(new NoQuackBehavior());
        srd.display();

    }
}
