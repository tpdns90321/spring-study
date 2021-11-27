
public class Rectangle implements Area {
	private double x, y;

	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		return this.x * this.y;
	}
}
