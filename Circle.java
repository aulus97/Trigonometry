
public class Circle extends Point {          
	// variáveis de instancia privadas, isto é, não acessíveis de fora desta classe.
	private double radius;
	private String color;
	private double length;
	
	// primeiro construtor o qual atribui valores iniciais a ambos: radius e color .
	public Circle() {
		radius = 1.0;
		color = "red";
		length = 2*radius*Math.PI;
	}
	
	// Segundo construtor que inicia radius com o parâmetro recebido, e matem color com o valor padrão definido.
	public Circle(double radius) {
		this.radius = radius;   
		color = "red"; // cria o objeto com o primeiro construtor:.Circle()
	}
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	public String toString() {   
		return "Circulo: raio = " + radius + " cor = " + color;   
	}
	// metodo Set para a variável de instancia radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// metdodo Set para a variável de instancia  color
	public void setColor(String color) {
		this.color = color;
	}
	// Metodo de acesso para obter o valor armazenado em radius
	public double getRadius() {
		return radius; 
	}
	// Metodo de acesso para computar a área de um circulo.
	public double getArea() {
		return radius*radius*Math.PI; // PI é a constante. Math é a classe onde PI é definido
	}
	public double getLength() {
		return length;
	}
	public String getColor() {
		return color;
	}

}
//nao compilou por falta de uma main