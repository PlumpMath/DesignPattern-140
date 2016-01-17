package com.felix.dp.observer;

/**
 * Created by weatherfish on 16/1/17.
 */
public class TestData {
    public int id = 0;
    public String name = "a";
    public String address = "bbb";

    public TestData(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
