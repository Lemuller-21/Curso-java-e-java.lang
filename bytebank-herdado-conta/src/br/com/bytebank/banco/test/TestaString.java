package br.com.bytebank.banco.test;

public class TestaString {

	public static void main(String[] args) {

		String vazio = "  Alura  ";
		System.out.println(vazio.isEmpty());
		
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		
		System.out.println(vazio.contains("Alu"));
		
		String nome = "Alura"; //object literal
//		String outro = new String("Alura");
		
//		System.out.println(nome.length());
		
//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
//		System.out.println(nome.substring(1));
		
//		System.out.println(nome.indexOf("u"));
		
//		System.out.println(nome.charAt(0));
		
//		char c = 'A';
//		char d = 'a';
//		System.out.println(nome.replace(c, d));
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		
	}

}
