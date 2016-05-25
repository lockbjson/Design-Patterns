package spaceship;

public interface EnemyShipFactory {

	// Ngoài việc build ships, thì nhà máy còn cung cấp các components khác cho
	// ship: engine, weapon

	public ESWeapon addESGun();

	public ESEngine addESEngine();

}
