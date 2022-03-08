package com.swedbank.itacademy.cleancode.dependencyinversion;

public class Main {

    public static void main(String[] args) {
        Keyboard optical = new OpticalKeyboard();
        Monitor highRefreshRate = new HighRefreshRateMonitor();
        Windows98Machine machine = new Windows98Machine(optical, highRefreshRate);

        Keyboard mechanicalKeyboard = new MechanicalKeyboard();
        Monitor standardMonitor = new StandardMonitor();
        Windows98Machine machineNew = new Windows98Machine(mechanicalKeyboard, standardMonitor);
        nullSafe("122");
        nullSafe("122");
        nullSafe("122");
    }

    public static String statement(String cityname) {
        return cityname == null ? "" : cityname == "" ? "" : "";
    }

    public static boolean nullSafe(String cityname) {
        System.out.println("1".equals(cityname));
        return "1".equals(cityname);
    }
}
