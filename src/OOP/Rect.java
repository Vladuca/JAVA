package OOP;

public class Rect {
	int length;
	int width;

	void setDimention(int length, int width) {
		this.length = length;
		this.width = width;
	}

	int perimeter() {
		return 2 * (length + width);
	}

	int square() {
		return length + width;
	}
}
