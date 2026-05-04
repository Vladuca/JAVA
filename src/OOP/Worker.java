package OOP;

public class Worker {
	String name;
	String jobtitle;
	int salary;

	Worker(String name, String jobtitle, int salary) {
		this.name = name;
		this.jobtitle = jobtitle;
		this.salary = salary;
	}
	
	String workerinfo(int i) {
		int saleryMonth = i * salary;
		return "Сотрудннк: " + name + "\nПрофесия: " + jobtitle + "\nЗарплата за " + i + " месяцев: " + saleryMonth;
	}
}
