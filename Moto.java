package Modelo;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {

	private String cilindrada;

	public Moto(String marca, String modelo, String cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	DecimalFormat fd = new DecimalFormat("#,###.00");
	
	@Override
	public String toString() {
		return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: "
				+ this.getCilindrada() + " // Precio: $" + fd.format(this.getPrecio());
	}

}
