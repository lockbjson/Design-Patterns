package observer1;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
	private List<Observer> obs = new ArrayList<Observer>();
	private String nameProduct;

	public Product(String nameProduct) {
		super();
		this.nameProduct = nameProduct;
	}

	@Override
	public void attachObserver(Observer observer) {
		obs.add(observer);
	}

	@Override
	public void detachObserver(Observer observer) {
		obs.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer ob : obs) {
			ob.update(nameProduct);
		}
	}
}