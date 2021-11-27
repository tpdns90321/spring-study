
public interface Area {
	double getArea();
	default boolean isLargerThan(Area other) {
		return this.getArea() > other.getArea();
	}
}
