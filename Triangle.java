import java.util.Scanner;

public class Triangle {
	private double a;
	private double b;
	private double c;
	private String type;
	private Scanner resposta;
	private double angles[];
	public Triangle() {
		a = b = c = 4;
		type = "equilatero";
	}
	public Triangle(double a, double b, double c) {
		
	}
	public boolean MakeTriangle(double a, double b, double c) {
		if(!IsValidTriangle(a, b, c)) 
			if(!LadosErrados(a,b,c))
				return false;
		else {
			System.out.println("\\nOs lados especificados formam um triangulo\n");
			setTriangle(a,b,c);
			System.out.println("\nTriangulo criado com sucesso\n");
		}
		return true;
	}
	private boolean LadosErrados(double a, double b, double c) {//ver se isso altera a resposta da main!!
		System.out.println("\nOs lados especificados nao formam um  triangulo\n" + "Escolha uma opcao: \n1 -> Definir outros valores\n2 -> Deixar que o programa gere um triangulo");
		resposta = new Scanner(System.in);
		System.out.println("\nDigite o numero corrrespondente a opcao escolhida:");
		int opcao = resposta.nextInt();//na main vai ter que ter um while caso a opçao seja 1 !!!
		if(opcao == 1)
			return false;
		FazNovoTriangulo(a,b,c);
		System.out.println("\nO novo triangulo possui lados: "+"a = "+this.a + "b = "+ this.b + "c = "+this.c + "\n");
		return true;
	}
	private void FazNovoTriangulo(double a, double b, double c) {
		do{
			a++;
			b++;
			c++;
			if(!IsValidTriangle(a,b,c)) {
				setTriangle(a,b,c);
				return;
			}
		}while(true);
	}
	public void setTriangle(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
	}
	private boolean IsValidTriangle(double a, double b, double c) {
		if(a >= b+c || b >= a+c || c >= a+b)
			return false;
		return true;
	}
	public double Perimeter() {
		return a+b+c;
	}
	public double Area() {
		//segundo a formula de Herão de Alexandria:
		double per = Perimeter()/2;
		per *= (per-a)*(per-b)*(per-c);
		return Math.sqrt(per);
	}
	public void FindType(){
		Type_By_Sides();
		Type_By_Angles();
		setAngles();
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
		if(angles[0] < 90 || angles[1] < 90 || angles[2] < 90)
			type += "e Acutangulo";
		else if(angles[0] == 90 || angles[1] == 90 || angles[2] == 90)
			type += "e Retangulo";
		else if(angles[0] > 90 || angles[1] > 90 || angles[2] > 90)
			type += "e Obtusangulo";
	}
	private void setAngles() {
		//a
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		double c2 = Math.pow(c, 2);
		double cosAngle = (a2 - b2 - c2)/(-1*2*b*c);
		//angulo a
		angles[0] = Math.toDegrees(Math.acos(cosAngle));
		cosAngle = (b2 - a2 - c2)/(-1*2*a*c);
		//angulo b
		angles[1] = Math.toDegrees(Math.acos(cosAngle));
		//angulo c
		angles[2] = 180 - angles[0] - angles[1];
	}
	public String toString() {
		return "Traingulo: Lados: a = " + a + " b = " + b + " c = " + c + 
				"\nArea: " + Area() + "\nPerimetro: " + Perimeter() + "\nTipo: " + type + 
				"\nAngulos Internos: " + angles[0] + " " + angles[1] + " " + angles[2];
	}
}
/*
 https://www.mathsisfun.com/algebra/trig-solving-triangles.html
 https://mundoeducacao.bol.uol.com.br/matematica/classificacao-triangulos.htm
 https://pt.wikipedia.org/wiki/Lei_dos_cossenos
 https://www.tutorialspoint.com/java/number_cos.htm
 https://www.tutorialspoint.com/java/number_acos.htm
 */
