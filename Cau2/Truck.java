package Cau2;

public class Truck extends AVehicle {
	private double loadingCap;

	/**
	 * @param model
	 * @param madeYear
	 * @param price
	 * @param manufactor
	 * @param loadingCap
	 */
	public Truck(String model, int madeYear, double price, Manufactor manufactor, double loadingCap) {
		super(model, madeYear, price, manufactor);
		this.loadingCap = loadingCap;
	}

	@Override
	public String toString() {
		return "Truck: LoadingCap:" + loadingCap + " "+super.toString();
	}

	@Override
	public double discount() {
		// TODO Auto-generated method stub
		return this.getPrice()*0.9;
	}
	
}
