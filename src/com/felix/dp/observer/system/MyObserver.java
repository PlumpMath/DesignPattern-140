package com.felix.dp.observer.system;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by weatherfish on 16/1/17.
 */
public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        System.out.println(o.toString());

        System.out.println(arg.toString());

    }
}
