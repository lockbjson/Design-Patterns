package spaceship;

//Đây là factory dành chế tạo UFO Boss Enemy Ship

//Ships có nhiều bộ phận: weapon, engine. Những bộ phận này sẽ được 
//định nghĩa bằng các phương thước ở lớp EnemyShipFactory

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOBossGun();
	}

	@Override
	public ESEngine addESEngine() {
		return new ESUFOBossEngine();
	}

}
