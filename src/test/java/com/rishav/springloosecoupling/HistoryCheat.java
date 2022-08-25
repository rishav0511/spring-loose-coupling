package com.rishav.springloosecoupling;

public class HistoryCheat implements Cheat{
    public HistoryCheat() {
        System.out.println("HistoryCheat Constructor called..");
    }

    @Override
    public void cheating() {
        System.out.println("History cheating started..");
    }
}
