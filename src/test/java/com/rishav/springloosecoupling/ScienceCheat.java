package com.rishav.springloosecoupling;

public class ScienceCheat implements Cheat {
    public ScienceCheat() {
        System.out.println("ScienceCheat Constructor called..");
    }

    @Override
    public void cheating() {
        System.out.println("Science cheating started..");
    }
}
