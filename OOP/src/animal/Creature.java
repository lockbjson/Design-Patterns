package animal;

public abstract class Creature {
	protected String name;
	protected double height;
	protected int weight;
	protected String favFood;
	protected double speed;
	protected String sound;

	public abstract void setName(String newName);

	public abstract String getName();

	public abstract void setHeight(double newHeight);

	public abstract double getWeight();

	public abstract void setFavFood(String newFood);

	public abstract String getFavFood();

	public abstract void setSpeed(double newSpeed);

	public abstract double getSpeed();

	public abstract void setSound(String newSound);

	public abstract String getSound();
}
