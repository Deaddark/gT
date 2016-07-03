package com.company.Animals;

/**
 * Created by Ilya on 02.07.2016.
 */
public class  BaseCat implements BaseAnimal  {
    public  String name;
    public  String catType;

    public BaseCat(String name, String catType) {
        this.name = name;
        this.catType = catType;
    }



    @Override
    public void walk() {
        System.out.println(catType+" "+name+" Walks");    }

    @Override
    public void sleep() {
        System.out.println(catType+" "+name+" Sleeping");    }

    @Override
    public void eat() {
        System.out.println(catType+" "+name+" Eat");    }

    @Override
    public void drink() {
        System.out.println(catType+" "+name+" Drinks");
    }

    @Override
    public void signal() {
        System.out.println(catType+" "+name+" Meow");
    }
}
