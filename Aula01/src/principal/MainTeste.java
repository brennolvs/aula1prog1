 package principal;

import java.util.Scanner;

public class MainTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		float sal;
		String nome;
		System.out.println("Informe a sua idade:");
		idade = sc.nextInt();
		System.out.println("Informe o seu salario:");
		sal = sc.nextFloat();
		sc.nextLine();
		System.out.println("Informe seu nome: ");
		nome=sc.nextLine();
		System.out.println(""+nome);
		System.out.println("Seu salario é no valor de: "+sal);
		if(idade>18) {
			System.out.println("Você é maior de idade!");
		}
		else {
			System.out.println("Você é menor de idade pirralha");
		}
		System.out.println("Sua idade é: "+idade);

	}

}
