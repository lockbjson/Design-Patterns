package spaceship;

public class UFOBossEnemyShip extends EnemyShip {

	// Cũng tương tư như cái UFOEnemyShip

	EnemyShipFactory shipFactory;

	public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}

	@Override
	void makeShip() {
		System.out.println("Making enemy ship " + getName());
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
	}

}
