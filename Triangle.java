import java.util.Scanner;

public class Triangle {
	private float a;
	private float b;
	private float c;
	private String type;
	private Scanner resposta;
	private float angles[];
	/*public Triangle() {
		a = b = c = 4;
		type = "equilatero";
	}*/
	public Triangle(float a, float b, float c) {
		if(!IsValidTriangle(a, b, c)) 
			LadosErrados(a,b,c);
		else {
			System.out.println("\\nOs lados especificados formam um triangulo\n");
			setTriangle(a,b,c);
			System.out.println("\nTriangulo criado com sucesso\n");
		}
	}
	private boolean LadosErrados(float a, float b, float c) {//ver se isso altera a resposta da main!!
		System.out.println("\nOs lados especificados nao formam um  triangulo\n" + "Escolha uma opcao: \n1 -> Definir outros valores\n2 -> Deixar que o programa gere um triangulo");
		resposta = new Scanner(System.in);
		System.out.println("\nDigite o numero corrrespondente a opcao escolhida:");
		int opcao = resposta.nextInt();//na main vai ter que ter um while caso a opçao seja 1 !!!
		if(opcao == 1)
			return false;
		FazTriangulo(a,b,c);
		System.out.println("\nO novo triangulo possui lados: "+"a = "+this.a + "b = "+ this.b + "c = "+this.c + "\n");
		return true;
	}
	private void FazTriangulo(float a, float b, float c) {
		do{
			a++;
			b++;
			c++;
			if(!IsValidTriangle(a,b,c))
				setTriangle(a,b,c);
		}while(true);
	}
	public void setTriangle(float a, float b, float c) {
			this.a = a;
			this.b = b;
			this.c = c;
	}
	private boolean IsValidTriangle(float a, float b, float c) {
		if(a >= b+c || b >= a+c || c >= a+b)
			return false;
		return true;
	}
	public float Perimeter() {
		return a+b+c;
	}
	public float Area() {
		//segundo a formula de Herão de Alexandria:
		float per = Perimeter()/2;
		per *= (per-a)*(per-b)*(per-c);
		return (float)Math.sqrt((double)per);
	}
	public String FindType() {
		
	}
	private void Type_By_Sides(){
		if(a==b && b==c && c==a)
			type = "Equilatero";
		else if(a==b || b==c || c==a)
			type = "Isosceles";
		else if(a!=b && b!=c || c!=a)
			type = "Escaleno";
	}
	private void Type_By_Angles() {
		if(type.compareTo("Equilatero") == 0)
			type += "e Acutangulo";
		else if()
			
	}
	private setAngles() {
		//a
		float a2 = (float) Math.pow(a, 2);
		float b2 = (float) Math.pow(b, 2);
		float c2 = (float) Math.pow(c, 2);
		float cosAngle = (a2 - b2 - c2)/(-1*2*b*c);
		
	}
}
/*
 https://www.mathsisfun.com/algebra/trig-solving-triangles.html
 https://mundoeducacao.bol.uol.com.br/matematica/classificacao-triangulos.htm
 https://pt.wikipedia.org/wiki/Lei_dos_cossenos
 https://www.tutorialspoint.com/java/number_cos.htm
 https://www.tutorialspoint.com/java/number_acos.htm
 */
