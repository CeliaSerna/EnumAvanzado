package com.cursoceat.model;

public enum Iva {
NORMAL(1.21),MEDICINAS(1.04),ALIMENTACION(1.1),OTROS(1.05),EXENTO(1.0);
	
	private double porcentaje;

	private Iva(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
	
}
