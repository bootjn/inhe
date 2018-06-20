package com.company;

public class AnimalApp {

    public static void main(String[] args) {
	// write your code here


        Animal a = new Animal();
        System.out.print(a.eat());
        a.sleep();

        Cat c = new Cat();
        System.out.print(c.eat());
        c.sleep();
        System.out.print(c.purrr());

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();

        Tiger t = new Tiger();
        t.eat();
        t.sleep();

        Elephant e = new Elephant();
        e.eat();
        e.sleep();
        e.poop();
        System.out.print(e.poop());

        Dog d = new Dog();
        d.eat();
        d.sleep();
        System.out.print(d.bark());

        Kitty k = new Kitty();
        k.eat();
        System.out.print(k.eat());
        k.say();
        System.out.print(k.say());

    //}
    }
}
