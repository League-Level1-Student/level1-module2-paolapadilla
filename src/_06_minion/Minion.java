package _06_minion;

public class Minion {
	String name;
	int eyes;
	String color;
	String empty;
	String master;

//Constructor
	Minion(String name, int eyes, String color, String empty) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.empty = empty;
	}

	public String getName() {
		return name;
	}

	public int getEyes() {
		return eyes;
	}

	public String getColor() {
		return color;
	}

	public void setMaster(String masterName) {
		master = masterName;
	}

	public String getMaster() {
		return master;
	}

}
