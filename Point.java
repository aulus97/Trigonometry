package Trigonometry;

public class Point {
	private float x;
	private float y;
	public void setCoordenadas(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public float getx() {
		return x;
	}
	public float gety() {
		return y;
	}
	public String toString() {
		return "Ponto: x = " + x + "y = " + y;
	}
}
