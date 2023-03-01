package ejerciciosbasicos_1;

import java.util.Scanner;


public class EjerciciosBasicos_16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia entre los vehículos en kilómetros: ");
        double distancia = sc.nextDouble();
        
        System.out.print("Ingrese la velocidad del vehículo detrás en km/h: ");
        double velocidad1 = sc.nextDouble();
        
        System.out.print("Ingrese la velocidad del vehículo adelante en km/h: ");
        double velocidad2 = sc.nextDouble();
        
        // Calcula el tiempo que tarda el vehículo más rápido en alcanzar al otro
        double tiempo = (distancia / (velocidad2 - velocidad1)) * 60; // Se multiplica por 60 para convertir a minutos
        
        System.out.println("El vehículo más rápido alcanzará al otro en " + tiempo + " minutos.");
      
    }
    
}
