package com.company;

public class Cat extends Animal{
    public Cat() {
        System.out.println("cat created!");
    }
    @Override
    public String eat(){
        return "cat eats..." ;//ow crap
    }
    @Override
    public String sleep(){
        return "cat sleeps...";
    }
    public String purrr(){
        return "kitty puuur";
    }
}
