
public class ex01 {
	public static void main(String args[]) {
		Rectangle rect1 = new Rectangle(2, 4);
		Rectangle rect2 = new Rectangle(4, 9);
		Circle circle = new Circle(3);

		System.out.println("rect1: " + rect1.getArea());
		System.out.println("rect2: " + rect2.getArea());
		System.out.println("circle: " + circle.getArea());

		System.out.println("rect1 > rect2 : " + rect1.isLargerThan(rect2));
		System.out.println("rect1 > circle : " + rect1.isLargerThan(circle));
		System.out.println("rect2 > circle : " + rect2.isLargerThan(circle));

		Area[] areas = { rect1, rect2, circle };
		System.out.print("Area[] : ");
		for (Area a: areas) {
			System.out.print(a.getArea() + " ");
		}
		System.out.println();
	}
}
