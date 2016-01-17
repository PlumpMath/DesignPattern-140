package com.felix.dp.strategy2.fly;

/**
 * Created by weatherfish on 16/1/10.
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No Fly...");
    }
}
