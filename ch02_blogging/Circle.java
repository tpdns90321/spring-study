
public class Circle implements Area {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.pow(this.radius, 2) * Math.PI;
	}
}
