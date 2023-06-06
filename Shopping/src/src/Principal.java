package src;

import java.util.Scanner;

public class Principal {
public int val;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(1)| Criar uma Loja   |");
		System.out.println("(2)| Criar Um Produto |");
		System.out.println("(3)| Sair	      |");
		Scanner ler = new Scanner(System.in);
		int val = ler.nextInt();
		while(val != 3) {
			 val = ler.nextInt();
		switch (val) {
		case 1:

			System.out.println("(1)| Criar uma Loja   |");
			Loja loja = new Loja(null, val, null);
		break;

		case 2:
			System.out.println("(2)| Criar Um Produto |");
		// bloco de código que será executado
			Produto produto = new Produto(null, null, null, val, val);
			System.out.println(produto.estaVencido());
		break;

		case 3:

		// bloco de código que será executado

		break;

		default:

		// bloco de código que será executado se nenhum dos cases for aceito

		}
	}

}
}
