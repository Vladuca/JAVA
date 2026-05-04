package OOP;

public class Main {
	public static void main(String[] arg) {
	    Monster[] monsters = {new Monster(3),new Monster(3,2),new Monster(3,3,3)};
	    for(Monster monster : monsters) {
	    	monster.show();
	    }
		
	}
}
