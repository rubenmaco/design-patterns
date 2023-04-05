package com.kreitek.pets.controllers;

public class Logger {
    public int contador = 0;
    private static Logger instance = null;

    //He creado este constructor privado para evitar que se creen constuctores públicos y evitar problemas con el patrón Singleton
    private Logger(){

    }
    public static Logger getInstance() {
        if (instance ==null) {
            instance = new Logger ();
        }
        return instance;
    }
    public void debug (String message) {
        contador++;
        System.out.println("[debug][" + contador + "] - " +message);
    }

}
