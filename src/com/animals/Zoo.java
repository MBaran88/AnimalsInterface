package com.animals;

import com.animals.Animals.Dog;
import com.animals.Animals.Elephant;
import com.animals.Animals.Snake;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-05-10.
 */
public class Zoo {
    private ArrayList<Dog> dogs = new ArrayList<>();
    private ArrayList<Elephant> elephants = new ArrayList<>();
    private ArrayList<Snake> snakes = new ArrayList<>();

    public void init() {

        dogs.add(new Dog());

        elephants.add(new Elephant());

        snakes.add(new Snake());
    }
    public void runAnimalByObejectReference(){
        for (Dog dog:dogs){
            dog.run();
        }
        for (Elephant elephant:elephants){
            elephant.run();
        }
        for (Snake snake:snakes) {
            snake.run();
        }
}}
