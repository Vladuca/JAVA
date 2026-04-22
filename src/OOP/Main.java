package OOP;

public class Main {
	public static void main(String[] arg) {
		Dog dog = new Dog();
		dog.nickname = "Тузік";
		dog.breed = "Дворняга";
		dog.speed = 1;
		
		String info = dog.info();
		System.out.print(info);
		
		}
}
