package com.felix.dp.strategy;

/**
 * Created by weatherfish on 16/1/10.
 */
public class MultiStrategy implements IStrategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
