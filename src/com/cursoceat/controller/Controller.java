package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.model.Iva;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
int opcion;
double precio=0;
do {
	System.out.println("Indique el árticulo a pagar");
	System.out.println("1- Aceite de oliva");//5%
	System.out.println("2- Leche");//10%
	System.out.println("3- Cerveza");
	System.out.println("4- Mascarillas quirúrgicas ");
	System.out.println("5- Queso");
	System.out.println("6- Salir");

	opcion = entrada.nextInt();
   if(opcion>0 && opcion <6) {

    System.out.println("Indique el precio");    
    precio = entrada.nextDouble();
   }
   
    switch (opcion) {
    case 1 -> {
    	Iva impuesto= Iva.OTROS;
    	calcularTotal(precio, impuesto.getPorcentaje());
    	}
    case 2-> {
    	Iva impuesto= Iva.ALIMENTACION;
    	calcularTotal(precio, impuesto.getPorcentaje());
    }
    case 3-> {
    	Iva impuesto= Iva.NORMAL;
    	calcularTotal(precio, impuesto.getPorcentaje());
    }
    case 4-> {
    	Iva impuesto= Iva.MEDICINAS;
    	calcularTotal(precio, impuesto.getPorcentaje());
    }
    case 5-> {
    	Iva impuesto= Iva.EXENTO;
    	calcularTotal(precio, impuesto.getPorcentaje());
    }
    case 6-> {
    	System.out.println("Hasta luego ");
    }
    default-> System.err.println("Opción no válida");
    }
   
}while(opcion!=6);
	
	
}
	
static void calcularTotal(double precio, double porcentaje) {
    double iva=porcentaje;
    System.out.printf("El importe a pagar es %.2f", precio*iva);
	System.out.println(" ");
	
	
}


}