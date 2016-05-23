package animal;

public class Animal {
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}

	public String getFavFood() {
		return this.favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public double getSpeed() {
		return this.speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getSound() {
		return this.sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	private void bePrivate() {
		System.out.println("I'm a private method");
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		a.setName("Grover");
		System.out.println(a.getName());
	}
}
