package com.animals.Animals;

import com.animals.interfaces.Movable;

/**
 * Created by RENT on 2017-05-10.
 */
public class Snake implements Movable {
    @Override
    public void run() {
        System.out.println("Snake: I'm running");
    }

    @Override
    public void hide() {
        System.out.println("Snake: I'm hiding!");
    }
}
