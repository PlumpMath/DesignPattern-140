package com.felix.dp.strategy2.quack;

/**
 * Created by weatherfish on 16/1/10.
 */
public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("NoNo....");
    }
}
