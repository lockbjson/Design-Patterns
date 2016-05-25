package spaceship;

public class UFOEnemyShip extends EnemyShip {

	// Loại ship mà bạn muốn tạo sẽ được đưa vào factory để chế tạo

	EnemyShipFactory shipFactory;

	// UFO Enemy Ship này sẽ gồm có weapon và engine

	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}

	// EnemyShipBuilding gọi đến phương thức này để build a UFOEnemyShip

	@Override
	void makeShip() {
		System.out.println("Making enemy ship " + getName());

		// Loại ship này sẽ được trang bị những loại weapon và engine

		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
	}

}
