package animal;

public class Dog extends Animal {
	
	// The constructor initializes all objects

	public Dog() {
		super();
		setSound("Bark");
	}

	public void digHole() {
		System.out.println("Dog a hole");
	}

	public void changeVar(int randNum) {
		randNum = 12;
		System.out.println("randNum in method value: " + randNum);
	}

	private void bePrivate() {
		System.out.println("In a private method");
	}

	public void accessPrivate() {
		bePrivate();
	}
}
