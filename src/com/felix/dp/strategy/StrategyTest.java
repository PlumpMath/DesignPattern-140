package com.felix.dp.strategy;

/**
 * Created by weatherfish on 16/1/10.
 */
public class StrategyTest {

    public static void main(String[] args) {

        IStrategy strategy = new PlusStrategy();
        System.out.println(strategy.execute(10, 20));
    }

}
