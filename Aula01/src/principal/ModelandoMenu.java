package principal;

import java.util.Scanner;

public class ModelandoMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		System.out.println("Menu de opções: ");
		System.out.println("1- CADASTRAR");
		System.out.println("2-REMOVER");
		System.out.println("3-CONSULTAR");
		System.out.println("4-SAIR");
		System.out.println("Informe a sua opção desejável: ");
		op =sc.nextInt();
		switch(op) {
			case 1: {
				System.out.println("Opção Cadastrar");
				break;
			}
			case 2: {
				System.out.println("Opção Remover");
				break;
			}
			case 3: {
				System.out.println("Opção Consultar");
				break;
			}
			case 4: {
				System.out.println("Opção Sair");
				break;
			}
			default: {
				System.out.println("OPÇÃO INVALIDA");
			}
		}
	}

}
