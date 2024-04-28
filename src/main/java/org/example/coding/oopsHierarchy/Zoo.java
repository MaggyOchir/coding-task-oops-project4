package org.example.coding.oopsHierarchy;

interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();
}

abstract class Animal implements AnimalBehavior{
    //void sleep(){
      //  System.out.println(animal+" eats");
    }


class Mammals{

}
class Bird{

}

class Lion extends Mammals{

}
class Elephant extends Mammals{

}

class Parrot extends Bird{

}

class Eagle extends Bird{

}