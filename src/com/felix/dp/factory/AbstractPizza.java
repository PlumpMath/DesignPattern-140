package com.felix.dp.factory;

/**
 * Created by weatherfish on 16/1/10.
 */
public abstract class AbstractPizza implements IPizza {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void bake() {
        System.out.println(name + " baking ");
    }

    @Override
    public void cut() {
        System.out.println(name + " cuting ");
    }

    @Override
    public void boxing() {
        System.out.println(name + " boxing ");
    }

    public void done(){
        this.prepare();
        this.bake();
        this.cut();
        this.boxing();
    }
}
