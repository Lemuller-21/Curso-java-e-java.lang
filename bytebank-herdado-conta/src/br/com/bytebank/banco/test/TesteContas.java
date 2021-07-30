package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		//   Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(1231, 2223);
		cc.deposita(100);
		System.out.println(cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(2222, 2224);
		cp.deposita(100);
		
		cc.transfere(10, cp);
		System.out.println("cc: " + cc.getSaldo());
		System.out.println("cp: " + cp.getSaldo());
		
		cc.deposita(0.2);
		System.out.println(cc.getSaldo());
		
	}
}
