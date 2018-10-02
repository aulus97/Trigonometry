
public class Circle {          
	// salvar como "Circle.java"
	// variáveis de instancia privadas, isto é, não acessíveis de fora desta classe.
	private double radius;
	private String color;
	// primeiro construtor o qual atribui valores iniciais a ambos: radius e color .
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	// Segundo construtor que inicia radius com o parâmetro recebido, e matem color com 
	//o valor padrão definido.
	public Circle(double r) {
		this();   
	// cria o objeto com o primeiro construtor:.Circle()color = "red";
	}
	public Circle(double r, String c){
		this();
		radius = r;
		color = c;
	}
	// Metodo de acesso para obter o valor armazenado em radius
	public double getRadius() {
		return radius; 
	}
	// Metodo de acesso para computar a área de um circulo.
	public double getArea() {
		return radius*radius*Math.PI; // PI é a constante. Math é a classe onde PI é definido
	}
	public String getColor() {
		return color;
	}
	// metodo Set para a variável de instancia radius
	public void setRadius(double radius) {
		
	}
	// metdodo Set para a variável de instancia  color
	public void setColor(String color) {
	}
}
//nao compilou por falta de uma main