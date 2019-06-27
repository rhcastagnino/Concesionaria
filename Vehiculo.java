package Modelo;

import java.text.DecimalFormat;

public abstract class Vehiculo implements BuscarPorLetra, Comparable<Vehiculo>{

	private String marca;
	private String modelo;
	private double precio;

	public Vehiculo() {

	}

	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return this.getMarca() + " " + this.getModelo();
	}
	
	@Override
	public int compareTo(Vehiculo ve){
		int resultado = 0;
		if(this.getPrecio()<ve.getPrecio()){
			resultado = -1;
			} 
		else if(this.getPrecio()>ve.getPrecio()){
			resultado = 1;
		}
		return resultado;
	}
	
	DecimalFormat fd = new DecimalFormat("#,###.00");
	
	@Override
	public void buscar(String c) {
		if(this.getModelo().contains(c) == true){
			System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " +this.getMarca()+" "+this.getModelo()+" $"+ fd.format(this.getPrecio()));
		}
		
	
	}


}
