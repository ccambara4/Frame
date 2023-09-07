
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PREDATOR
 */
public class HiloOperaciones implements Runnable {
    
    private static final Random generador = new Random();
    private final int tiempo;
    private final String nombre;
    private final int opcion;

    public HiloOperaciones(int tiempo, String nombre, int opcion) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.opcion = opcion;
    }
    
    
    @Override
    public void run() {
        int resultado = 0;
        int numero = 12;
        int residuo = 0;
        
        try{
            DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
            
            switch (opcion){
                case 1:
             System.out.println("El hilo " + nombre + " se demorará " + tiempo + " milisegundos a las" + fechaFormato.format(LocalDateTime.now()));
             Thread.sleep(tiempo);
             for (int i = 0; i <= 10; i++){
                 residuo = numero * i;
                  System.out.println(numero + " X " + i + " = " + resultado);
             }
             System.out.println("\n");
             break;
             
                case 2:
                 System.out.println("El hilo " + nombre + " se demorará " + tiempo + " milisegundos a las" + fechaFormato.format(LocalDateTime.now()));
             Thread.sleep(tiempo);
             for (int i = 'a'; i <= 'j'; i++){
                  System.out.println(" " + i);
             }   
              break;
              
                case 3:
                    System.out.println("El hilo " + nombre + " se demorará " + tiempo + " milisegundos a las" + fechaFormato.format(LocalDateTime.now()));
                 thread.sleep(tiempo);
                 for (int i = 0; i <= 10; i++){
                 residuo = numero * i;
                 if(residuo == 0){
                 System.out.println(" " + i);
                 }
                 }
                  System.out.println("No valida la opcion");
                  break;
             }
            }
        }
    }
    
    
    
}
