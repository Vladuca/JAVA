package OOP;

public class Main {
	public static void main(String[] arg) {
		Worker worker = new Worker("Петя", "Водій", 35000);
		String saleryMonth = worker.workerinfo(2);
		System.out.println(saleryMonth);
	}
}
