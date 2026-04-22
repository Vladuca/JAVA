package OOP;

public class Dog {
	String nickname;
	String breed;
	int speed;

	public void show() {
		for (int i = 0; i < speed; i++) {
			System.out.println("бегу, ");
		}

	}
	
	public String info() {
		return "Кличка: " + nickname + ";" + "\nПорода: " + breed +  ";" +"\nСкорость: "+ speed;
	}

}
