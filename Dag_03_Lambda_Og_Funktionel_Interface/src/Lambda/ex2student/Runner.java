package Lambda.ex2student;

public class Runner {
	private String name; 
	private int lapTime;

	public Runner(String name) {
		this(name, 0);
	}

	public Runner(String name, int lapTime) {
		this.name = name;
		this.lapTime = lapTime;
	}

	@Override
	public String toString() {
		return String.format("Runner %s, %d sec\n", name, lapTime);
	}

	public String getName() {
		return name;
	}

	public int getLapTime() {
		return lapTime;
	}

}
