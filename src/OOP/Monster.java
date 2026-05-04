package OOP;

public class Monster {
	int eyes;
	int legs;
	int hands;

	public Monster() {
		eyes = 2;
		legs = 2;
		hands = 2;

	}

	public Monster(int eyes) {
		this.eyes = eyes;

	}

	public Monster(int eyes, int legs) {
		this.eyes = eyes;
		this.legs = legs;

	}

	public Monster(int eyes, int legs, int hands) {
		this.eyes = eyes;
		this.legs = legs;
		this.hands = hands;

	}

	void vois() {
		System.out.println("Голос");
	}

	void vois(int i) {
		for (int k = 0; k < i; k++) {
			System.out.println("Голос");
		}
	}

	void vois(int i, String word) {
		for (int k = 0; k < i; k++) {
			System.out.println(word);
		}
	}

	String body() {

		String body = "";
		body = makeBody(body);
		
		return body;//"Количенство глаз: " + eyes + "\nКоличество ног: " + legs + "\nКоличество рук: " + hands;

	}

	private String makeBody(String body) {
		if(hasEyes()) {
			body += "Количенство глаз: " + eyes + " \n";
		}
		
		if(hasLegs()) {
			body += "Количество ног: " + legs + " \n";
		}
		
		if(hasHands()) {
			body += "Количество рук: " + hands + "\n";
		}
		return body;
	}

	void show() {
		System.out.println(body());
	}

	boolean hasEyes() {
		return eyes != 0 ? true : false;
	}
	
	boolean hasLegs() {
		return legs != 0 ? true : false;
	}
	
	boolean hasHands() {
		return hands != 0 ? true : false;
	}
	
	
}
