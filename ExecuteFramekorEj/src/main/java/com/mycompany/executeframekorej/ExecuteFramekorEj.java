/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.executeframekorej;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PREDATOR
 */
public class ExecuteFramekorEj {

    public static void main(String[] args) {
        try {
        DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        
        Hilos h1 = new Hilos("h1");
        Hilos h2 = new Hilos("h2");
        Hilos h3 = new Hilos("h3");
        Hilos h4 = new Hilos("h4");
        Hilos h5 = new Hilos("h5");
        
        System.out.println(" **** Inicio de la ejecución *** a las " + fechaFormato.format(LocalDateTime.now()));
        System.out.println("******");
        
        ExecutorService executorService  = Executors.newCachedThreadPool();
        executorService.execute(h1);
        executorService.execute(h2);
        executorService.execute(h3);
        executorService.execute(h4);
        executorService.execute(h5);
        
        executorService.shutdown();
         executorService.awaitTermination(1, TimeUniT);
        
         System.out.println("Hilo principal " + fechaFormato.format(LocalDateTime.now()));
        }catch (InterruptedException ex){
            Logger.getLogger(ExecuteFramekorEj.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
