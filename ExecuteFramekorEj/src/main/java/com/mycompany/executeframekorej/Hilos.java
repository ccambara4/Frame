/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.executeframekorej;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author PREDATOR
 */
public class Hilos implements Runnable {

    private static final Random generador = new Random();
    private final int tiempo;
    private final String nombre;

    public Hilos(String nombre) {
        this.nombre = nombre;
        this.tiempo = generador.nextInt(8000);
    }
    
    
    @Override
    public void run() {
        DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        try {
            System.out.println("El hilo " + nombre + " se demorará " + tiempo + " siendo las " + fechaFormato.format(LocalDateTime.now()));
            Thread.sleep(tiempo);
            
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Error " + e.toString());
            Thread.currentThread().interrupt();
        }
        }
    }

