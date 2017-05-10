package com.animals.Animals;

import com.animals.interfaces.Movable;

/**
 * Created by RENT on 2017-05-10.
 */
public class Dog implements Movable{
    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + ": I'm running");
    }

    @Override
    public void hide() {
        System.out.println("Dog: I'm hiding!");
    }
}
