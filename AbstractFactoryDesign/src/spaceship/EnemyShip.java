package spaceship;

public abstract class EnemyShip {

	private String name;

	// Nếu như mình muốn thay đổi một bộ phận nào đó đã cũ bằng những bộ phận
	// mới hơn thì lớp này sẽ làm việc đó dễ dàng hơn

	// Ở dưới là những tính năng (behavior) của mỗi bộ phận trong ship

	ESWeapon weapon;
	ESEngine engine;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	abstract void makeShip();

	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}

	public void followHeroShip() {
		System.out.println(getName() + " is following the hero at " + engine);
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + weapon);
	}

	// Show các thông tin về ship lên màn hình

	public String toString() {
		String infoOnShip = "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;
		return infoOnShip;
	}

}
