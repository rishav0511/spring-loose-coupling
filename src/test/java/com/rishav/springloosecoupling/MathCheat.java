package com.rishav.springloosecoupling;

public class MathCheat implements Cheat {

    public MathCheat() {
        System.out.println("MathCheat Constructor called..");
    }

    @Override
    public void cheating() {
        System.out.println("Math cheating started..");
    }
}
