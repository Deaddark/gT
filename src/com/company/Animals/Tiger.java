package com.company.Animals;

/**
 * Created by Ilya on 03.07.2016.
 */
public class Tiger extends BaseCat {
    @Override
    public void signal() {
        System.out.println("RaAAAWW!");
    }

    public Tiger(String name, String catType) {
        super(name, catType);

    }
}
