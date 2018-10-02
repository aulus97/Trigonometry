
public class TestCircle {       
// salve como "TestCircle.java"
	public static void main(String[] args) {
		//  Declara  c1	como  variável  habilitada  a  armazenar  uma  referencia  para  objeto  da  classe	Circle.
		Circle c1; 
		// atribui a c1 .a referencia retornada pelo construtor padrão Circle () 
		c1 	= new Circle();
		// Para invocar os metodos classe Circle para	operar sobre a instância c1,
		// usa-se o operador ponto (“.”). 
		//Em outras palavras: usa-se o ponto para enviar uma mensagem ao objeto c1 para que 
		// ele execute um de seus métodos.
		System.out.println("O circulo tem o raio de "+ c1.getRadius() + " e area de "+ c1.getArea());
		// Declara e aloca uma segunda instancia da classe Circle chamada c2 
		// 	com o valor do radius igual a 2.0 	e color	com valor padrão.
		Circle c2 = new Circle(2.0);
		// Para invocar os metodos 	a oerar sobre a instância c2, usa-	se o operador ponto (“.”)
		System.out.println("O circulo tem raio de "+ c2.getRadius() + " e area de "+ c2.getArea());
		// Declara e aloca uma segunda instancia da classe Circle chamada c2 
		// 	com o valor do radius igual a 2.0 	e color	com valor azul.
		Circle c3 = new Circle(2.0,"azul");
		// Para invocar os metodos 	a oerar sobre a instância c2, usa-	se o operador ponto (“.”)
		System.out.println("O circulo tem raio de "+ c3.getRadius() + " e area de "+ c3.getArea());
		
		//imprimindo o getColor
		System.out.println("O circulo tem raio de "+ c3.getRadius() + ", area de "+ c3.getArea() + " e cor " + c3.getColor());
		
		//c1.radius=5.0;

	}
	// fim do método  main()
}
// fim da classe TestCircle

//compilou e o resultado foi:
/*
O circulo tem o raio de 1.0 e area de 3.141592653589793
O circulo tem raio de 1.0 e area de 3.141592653589793
*/

/*
O circulo tem o raio de 1.0 e area de 3.141592653589793
O circulo tem raio de 1.0 e area de 3.141592653589793
O circulo tem raio de 2.0 e area de 12.566370614359172
*/

/*
O circulo tem o raio de 1.0 e area de 3.141592653589793
O circulo tem raio de 1.0 e area de 3.141592653589793
O circulo tem raio de 2.0 e area de 12.566370614359172
O circulo tem raio de 2.0, area de 12.566370614359172 e cor azul
*/

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
The field Circle.radius is not visible

at TestCircle.main(TestCircle.java:28)
*/






