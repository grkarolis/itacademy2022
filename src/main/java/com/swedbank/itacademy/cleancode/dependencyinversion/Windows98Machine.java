package com.swedbank.itacademy.cleancode.dependencyinversion;

public class Windows98Machine {

    private Keyboard standardKeyboard;

    private Monitor standardMonitor;

    public Windows98Machine(Keyboard standardKeyboard, Monitor standardMonitor) {
        this.standardKeyboard = standardKeyboard;
        this.standardMonitor = standardMonitor;
    }
}
