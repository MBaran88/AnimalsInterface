package com.animals;

import com.animals.Animals.Dog;
import com.animals.Animals.Elephant;
import com.animals.Animals.Snake;
import com.animals.interfaces.Audible;
import com.animals.interfaces.Movable;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-05-10.
 */
public class Zoo {
    private ArrayList<Dog> dogs = new ArrayList<>();
    private ArrayList<Elephant> elephants = new ArrayList<>();
    private ArrayList<Snake> snakes = new ArrayList<>();

    public ArrayList<Movable> getMoveables() {
        return moveables;
    }

    private ArrayList<Movable> moveables = new ArrayList<>();

    public ArrayList<Audible> getAudibles() {
        return audibles;
    }

    private ArrayList<Audible> audibles = new ArrayList<>();

    public void init() {

        Dog dog = new Dog();
        dogs.add(dog);

        Elephant elephant = new Elephant();
        elephants.add(elephant);

        Snake snake = new Snake();
        snakes.add(snake);

        moveables.add(dog);
        moveables.add(elephant);
        moveables.add(snake);

        audibles.add(dog);
        audibles.add(elephant);
        audibles.add(snake);
    }

    public void runAnimalByObjectReference() {
        for (Dog dog : dogs) {
            dog.run();
        }
        for (Elephant elephant : elephants) {
            elephant.run();
        }
        for (Snake snake : snakes) {
            snake.run();
        }
    }

    public void runAnimalsByInterfaceReference() {
        for (Movable movable : moveables) {
            movable.run();
        }
    }

    public void hideAnimalsByInterfaceReference() {
        for (Movable movable : moveables) {
            movable.hide();
        }
    }

    public void makeNoiseAnimalsByInterfaceReference() {
        for (Audible audible : audibles) {
            audible.makeNoise();
        }
    }
}
