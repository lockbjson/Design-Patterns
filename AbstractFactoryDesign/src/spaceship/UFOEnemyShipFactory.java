package spaceship;

// Đây là factory dành chế tạo UFO Enemy Ship

// Ships có nhiều bộ phận: weapon, engine. Những bộ phận này sẽ được 
// định nghĩa bằng các phương thước ở lớp EnemyShipFactory

public class UFOEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOGun();
	}

	@Override
	public ESEngine addESEngine() {
		return new ESUFOEngine();
	}

}
