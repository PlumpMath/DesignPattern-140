package com.felix.dp.strategy2;

import com.felix.dp.strategy2.fly.FlyBehavior;
import com.felix.dp.strategy2.quack.QuackBehavior;

/**
 * Created by weatherfish on 16/1/10.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
