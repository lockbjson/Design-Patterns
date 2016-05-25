package spaceship;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	// Đây là lớp dành để build ships mà bạn muốn, cũng như cung cấp các option
	// để build

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip theEnemyShip = null;

		// Nếu như là UFO thì nó sẽ gửi đến UFOEnemyShipFactory chế tạo và những
		// weapon, engine được liên quan cũng sẽ được chế tạo

		if (typeOfShip.equals("UFO")) {
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
		} else

		// Nếu như là UFO BOSS thì nó sẽ gửi đến UFOBossEnemyShipFactory chế tạo
		// và những weapon, engine được liên quan cũng sẽ được chế tạo

		if (typeOfShip.equals("UFO BOSS")) {
			EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
			theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Boss Ship");
		}
		return theEnemyShip;
	}
}
