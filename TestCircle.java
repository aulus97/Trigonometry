package Trigonometry;

public class TestCircle {       
// salve como "TestCircle.java"
	public static void main(String[] args) {
		//  Declara  c1	como  variÃƒÂ¡vel  habilitada  a  armazenar  uma  referencia  para  objeto  da  classe	Circle.
		Circle c1; 
		
		// atribui a c1 .a referencia retornada pelo construtor padrÃƒÂ£o Circle () 
		c1 	= new Circle();
		
		/* Para invocar os metodos classe Circle para	operar sobre a instÃƒÂ¢ncia c1,usa-se o operador ponto (Ã¢â‚¬Å“.Ã¢â‚¬Â�). 
		Em outras palavras: usa-se o ponto para enviar uma mensagem ao objeto c1 para que ele execute um de seus mÃƒÂ©todos.
		*/
		
		System.out.println("O circulo tem o raio de "+ c1.getRadius() + " e area de "+ c1.getArea());
		/*
		Circle c2 = new Circle(1.2); 
		 
		System.out.println(c2.toString());  // chamada explicita 
		 
		System.out.println(c2);// println() chama toString() implicitamente 
		     
		// no exemplo abaixo o operador '+' invoca c2.toString() implicitamente. 
		System.out.println("Aqui o operador '+' tambÃ©m invoca toString(): " + c2); 
		*/
		System.out.println(c1.toString()); // chamada explicita

	}
	// fim do mÃƒÂ©todo  main()
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

/* Item 9a:

O circulo tem o raio de 1.0 e area de 3.141592653589793
O circulo tem raio de 2.0 e area de 12.566370614359172
O circulo tem raio de 5.0 e area de 78.53981633974483
O circulo tem raio de 5.0, area de 78.53981633974483 e cor green
Circulo: raio = 1.0 cor = red
 */

/* Item 9B
 REalmente invoca o toString >> Fantastico
 O circulo tem o raio de 1.0 e area de 3.141592653589793
Circulo: raio = 1.2 cor = red   <<<
Circulo: raio = 1.2 cor = red   <<<
Aqui o operador '+' tambÃ©m invoca toString(): Circulo: raio = 1.2 cor = red   <<<
O circulo tem raio de 5.0 e area de 78.53981633974483
O circulo tem raio de 5.0, area de 78.53981633974483 e cor green
Circulo: raio = 1.0 cor = red
 
 */


