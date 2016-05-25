package spaceship;

// Ở đây mình định nghĩa basic component của một space ship

public class ESUFOGun implements ESWeapon {

	// EnemyShip chứa đối tượng ESWeapon. Nó sẽ được lưu trữ trong field weapon

	// Strategy design pattern is being used here

	public String toString() {
		return "20 damage";
	}
}
