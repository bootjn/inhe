package com.company;

public class Kitty extends Cat {
    public Kitty(){
        System.out.println("helllo kitty created =^.^=");
    }
    @Override
    public String eat(){
        return "nomnom ";
    }
    public String say() {
        return "meow~@@!meow";
    }
}
