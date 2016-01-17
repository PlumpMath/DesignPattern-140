package com.felix.dp.observer;

import com.felix.dp.observer.system.MyObservable;
import com.felix.dp.observer.system.MyObserver;

/**
 * Created by weatherfish on 16/1/17.
 */
public class Main {
    public static void main(String[] args) {
        MyObserver observer = new MyObserver();
        MyObserver observer2 = new MyObserver();

        MyObservable observable = new MyObservable();
        observable.addObserver(observer);
        observable.addObserver(observer2);

        observable.setData(new TestData(1, "121313", "sdadasd"));

    }
}
