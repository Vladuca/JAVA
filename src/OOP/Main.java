package OOP;

public class Main {
	public static void main(String[] arg) {
		Rect rect = new Rect();
		rect.setDimention(4, 4);
		int a = rect.perimeter();
		int b = rect.square();
		System.out.print(a);
		System.out.print(b);


	}
}
