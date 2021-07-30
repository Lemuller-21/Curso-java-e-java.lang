package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaObject {

	public static void main(String[] args) {

//		System.out.println("X");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(123, 321);
		Object cp = new ContaPoupanca(321, 123);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
//		println(cliente);
		
	}
	
//	static void println() {}
//	static void println(int x) {}
//	static void println(String x) {}
//	static void println(Object x) {}

}
