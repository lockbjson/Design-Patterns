package animal;

public class Giraffe extends Creature {
	private String name;

	@Override
	public void setName(String newName) {
		name = newName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setHeight(double newHeight) {

	}

	@Override
	public double getWeight() {
		return 0;
	}

	@Override
	public void setSpeed(double newSpeed) {

	}

	@Override
	public double getSpeed() {
		return 0;
	}

	@Override
	public void setSound(String newSound) {

	}

	@Override
	public String getSound() {
		return null;
	}

	@Override
	public void setFavFood(String newFood) {

	}

	@Override
	public String getFavFood() {
		return null;
	}

}
