package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 123);
		cc.deposita(100);
		
		SeguroDeVida seg = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(seg);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
	}

}
