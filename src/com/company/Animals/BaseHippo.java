package com.company.Animals;

/**
 * Created by Ilya on 02.07.2016.
 */
public class BaseHippo implements BaseAnimal {
        public String name;

    public BaseHippo(String name) {
        this.name = name;
    }

    public void walk() {
            System.out.println("hippo "+name+" Walks");    }

        @Override
        public void sleep() {
            System.out.println("hippo "+name+" Sleeping");    }

        @Override
        public void eat() {
            System.out.println("hippo "+name+" Eat");    }

        @Override
        public void drink() {
            System.out.println("hippo "+name+" Drinks");
        }

        @Override
        public void signal() {
            System.out.println("hippo "+name+" RAAAAW!");
        }
    }


