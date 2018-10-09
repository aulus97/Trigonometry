
public class Circle extends Point {          
	// variáveis de instancia privadas, isto é, não acessíveis de fora desta classe.
	private double radius;
	private String color;
	private double length;
	//private Point center = new Point();
	// primeiro construtor o qual atribui valores iniciais a ambos: radius e color .
	public Circle() {
		radius = 1.0;
		color = "red";
		length = 2*radius*Math.PI;
		super.setCoordenadas(0, 0);
	}
	
	// Segundo construtor que inicia radius com o parâmetro recebido, e matem color com o valor padrão definido.
	public Circle(double radius, int x, int y) {
		this.radius = radius;   
		color = "red"; // cria o objeto com o primeiro construtor:.Circle()
		super.setCoordenadas(x,y);
	}
	public Circle(double radius, String color, int x, int y){
		this.radius = radius;
		this.color = color;
		super.setCoordenadas(x,y);
	}
	public String toString() {   
		return "Circulo: raio = " + radius + " cor = " + color + " centro: x = " + super.getx() + " y = " + super.gety();   
	}
	// metodo Set para a variável de instancia radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// metdodo Set para a variável de instancia  color
	public void setColor(String color) {
		this.color = color;
	}
	public void setCircleCenter(int x, int y) {
		super.setCoordenadas(x,y);
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
	public float getCircleCenter_x() {
		return super.getx();
	}
	public float getCircleCenter_y() {
		return super.gety();
	}
	public String getColor() {
		return color;
	}

}
//nao compilou por falta de uma main