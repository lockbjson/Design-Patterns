package spaceship;

public abstract class EnemyShipBuilding {
	// Quản lý việc chế tạo EnemyShips, những EnemyShips này sẽ có weapon
	// engine, name & nothing else

	// Nhưng loại weapon, engine, name này sẽ phụ thuộc vào typeOfShip
	protected abstract EnemyShip makeEnemyShip(String typeOfShip);

	public EnemyShip orderTheShip(String typeOfShip) {
		EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

		theEnemyShip.makeShip();
		theEnemyShip.displayEnemyShip();
		theEnemyShip.followHeroShip();
		theEnemyShip.enemyShipShoots();

		return theEnemyShip;
	}

}
