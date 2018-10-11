import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Triangle A = new Triangle();
		Scanner resposta = new Scanner(System.in);
		System.out.println("\nDigite o numero corrrespondente a opcao escolhida:");
		boolean AA = A.Triangle(resposta.nextDouble(),resposta.nextDouble(),resposta.nextDouble());
		if(AA == false) {
			System.out.println("\nDigite o numero corrrespondente a opcao escolhida:");
			AA = A.Triangle(resposta.nextDouble(),resposta.nextDouble(),resposta.nextDouble());
		}
		//double opcao = resposta.nextDouble();

	}

}
