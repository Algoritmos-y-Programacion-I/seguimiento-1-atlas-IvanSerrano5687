/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre;
        String ciudad;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();
        System.out.println("¿Que edad tienes?");
        int edad = escaner.nextInt();
        System.out.println("Ingrese su numero de documento");
        int doc = escaner.nextInt();
        System.out.println("¿Desde que ciudad nos contactas?");
        ciudad = escaner.nextLine();
        System.out.println("Bienvenido a EVENTOS ATLAS, Cuantas noches desea hospedarse? (minimo 1 - maximo 4)");
        int noches = escaner.nextInt();
        System.out.println("BUS(1) o AVION(2) ");
        int trans = escaner.nextInt();




        // ...
        
        // ...

        // Declaracion de salidas calculadas (completar)
        double totalTransporte;
        double totalHospedaje;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calculartotalTransporte(); // aqui podrian faltar parametros
        totalHospedaje = calculartotalHospedaje(noches + 150000);

        System.out.println("Bienvenido " + nombre + "!");
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + doc);
        System.out.println("El total del hospedaje: " + totalHospedaje);

	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return 0; // Completar operacion
    }

	

	
}