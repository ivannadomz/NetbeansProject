    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaanalisis;

import java.util.Scanner;

/**
 *
 * @author ivanna
 */
public class Analisis {
    
    public void procesarResultadosExamen() // metodo 
    {
           
      // crea objeto Scanner para obtener datos de entrada 
        Scanner entrada = new Scanner (System.in);
                
       // Incializar variables 
        int aprobado = 0; // nos va a dar el numero de aprobados 
        int reprobados = 0; // Nos va dar el numero de reprobados 
        int contadorestudiantes =1; // va a contar los estudiantes 
        int resultado; // nos va a dar un resultado
        
        
        // proceso de diez estudiantes, utilizando un ciclo controlado con contador 
        
        while (contadorestudiantes<=10)
        {
            //Solicitar al usuario la entrada y obtener el valor 
            System.out.print ("Escribe el resultado (1= aprobado, 2= reprobado):"); 
            
            resultado= entrada.nextInt();
            
            if (resultado ==1)
                aprobado= aprobado +1;  // los va contando 
            else 
                reprobados = reprobados+1; 
            
            // inncrementar contador de estudiantes para que el ciclo termine en un momento 
            
            contadorestudiantes = contadorestudiantes+1;
            
        }
        
        // preparar los reusltados para mostrarlos 
        System.out.printf( "Aprobado: %d\n Reprobados: %d\n" ,aprobado, reprobados);
        
        // DETERMINAR SI MAS DE 8 ESTUDIANTES Aprobaron 
        
        if ( aprobado> 8)
        System.out.println ("Aumentar"); 
    }
    
}
