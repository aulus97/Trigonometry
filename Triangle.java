
public class Triangle {
	private float a;
	private float b;
	private float c;
	private String type;
	public Triangle() {
		a = b = c = 4;
		type = "equilatero";
	}
	public Triangle(float a, float b, float c) {
		if(!IsValidTriangle(a, b, c)) {
			System.out.println("Os lados especificados nao formam um  triangulo\n");
		}
		else
			System.out.println("Os lados especificados nao formam um  triangulo\n");
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
}
