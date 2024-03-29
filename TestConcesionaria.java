package test;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import Modelo.Auto;
import Modelo.Moto;
import Modelo.Vehiculo;


public class TestConcesionaria {

	public static void main(String[] args) {

		Auto a1 = new Auto("Peugeot", "206", 4, 200000);
		Auto a2 = new Auto("Peugeot", "208", 5, 250000);
		Moto m1 = new Moto("Honda", "Titan", "125c", 60000);
		Moto m2 = new Moto("Yamaha", "YBR", "160c", 80500.50);
		List<Vehiculo> listave = new ArrayList<Vehiculo>();
		listave.add(a1);
		listave.add(m1);
		listave.add(a2);
		listave.add(m2);
		for(Vehiculo ve: listave){									//imprime la lista como se pide
			System.out.println(ve);
		}
		System.out.println("=============================");
		Collections.sort(listave, Collections.reverseOrder());     //Busca el mas caro e imprime
		int cont1 = 0;
		for(Vehiculo ve: listave){
			
			if(cont1 == 0){
				System.out.println("Veh�culo m�s caro: "+ ve.getMarca() + " " + ve.getModelo());
				cont1 ++;
			}
		}
		Collections.sort(listave);									//Busca el mas barato e imprime
		int cont2 = 0;
		for(Vehiculo ve: listave){
			
			if(cont2 == 0){
				System.out.println("Veh�culo m�s barato: "+ ve.getMarca() + " " + ve.getModelo());
				cont2 ++;
			}
		}
		for(Vehiculo ve: listave){									//Busca los que contienen con Y e imprime
			ve.buscar("Y");
		}
		System.out.println("=============================");
		System.out.println("Veh�culos ordenados por precio de mayor a menor:");
		Collections.sort(listave, Collections.reverseOrder());			//Se ordena de mayor a menor y se imprime en el formato perdido
		for(Vehiculo ve: listave){
			System.out.println(ve.getMarca() + " " + ve.getModelo());
		}
	}

}
