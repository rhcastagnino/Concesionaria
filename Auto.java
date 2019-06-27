package Modelo;

import java.text.DecimalFormat;

public class Auto extends Vehiculo {

	private int puertas;

	public Auto(String marca, String modelo, int puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	DecimalFormat fd = new DecimalFormat("#,###.00");
	
	@Override
	public String toString() {
		return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + this.getPuertas()
				+ " // Precio: $" + fd.format(this.getPrecio());
	}

}
