package com.animals;

import com.animals.Animals.Dog;
import com.animals.interfaces.Audible;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Zoo zoo = new Zoo();
        zoo.init();
        zoo.runAnimalByObjectReference();
        System.out.println("-----------------------------");
        zoo.runAnimalsByInterfaceReference();
        System.out.println("-----------------------------");
        zoo.hideAnimalsByInterfaceReference();
        System.out.println("-----------------------------");
        zoo.makeNoiseAnimalsByInterfaceReference();
        System.out.println("-----------------------------");
        Audible someAnimal = zoo.getAudibles().get(0);

        Dog myDog = (Dog) someAnimal;
        myDog.run();
        myDog.hide();
    }
        public void doSomething (Audible audible){audible.makeNoise();}//Classic example of an instance

        // System.out.println(someAnimal.getClass().getCanonicalName());
    }

