package com.felix.dp.observer.system;

import com.felix.dp.observer.TestData;

import java.util.Observable;

/**
 * Created by weatherfish on 16/1/17.
 */
public class MyObservable extends Observable {

    private TestData data;


    public void setData(TestData data) {
        if (!data.equals(this.data)) {
            this.data = data;
            setChanged();
            notifyObservers(data);
        }
    }
}
