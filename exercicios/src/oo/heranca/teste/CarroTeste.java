package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Mustang;

public class CarroTeste {
	
	
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(400);
		
		ferrari.desligarTurbo();
		ferrari.desligarAr();
		ferrari.velocidadeDoAr();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		
		System.out.println(ferrari.toString());
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		System.out.println(ferrari.toString());
		
		Mustang mustang = new Mustang(30);
		
		mustang.acelerar();
		mustang.acelerar();
		mustang.acelerar();
		mustang.acelerar();
		mustang.acelerar();
		
		System.out.println(mustang.toString());
		
		mustang.frear();
		mustang.frear();
		mustang.frear();
		
		System.out.println(mustang.toString());
	}
	
}
