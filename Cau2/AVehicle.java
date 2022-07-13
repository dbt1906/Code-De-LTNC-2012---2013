package Cau2;

public abstract class AVehicle {
	private String model;
	private int madeYear;
	private double price;
	private Manufactor manufactor;
	/**
	 * @param model nhan hieu
	 * @param madeYear nam san xuat
	 * @param price gia goc
	 * @param manufactor Hang san xuat
	 */
	public AVehicle(String model, int madeYear, double price, Manufactor manufactor) {
		this.model = model;
		this.madeYear = madeYear;
		this.price = price;
		this.manufactor = manufactor;
	}
	// tinh gia khuyen mai
	public abstract double discount();
	
	/**
	 * @return the manufactor
	 */
	public Manufactor getManufactor() {
		return manufactor;
	}
	@Override
	public String toString() {
		return "model:" + model + ", madeYear:" + madeYear + ", price:" + price  + " "+manufactor.toString();
		
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the madeYear
	 */
	public int getMadeYear() {
		return madeYear;
	}
	
}
