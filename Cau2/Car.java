package Cau2;

public class Car extends AVehicle{
	private int noSeats;
	private int maxSpeed;
	private int fuelPer100km;
	/**
 * @param model nhan hieu
	 * @param madeYear nam san xuat
	 * @param price gia goc
	 * @param manufactor Hang san xuat
	 * @param noSeats so cho ngoi
	 * @param maxSpeed van toc toi da
	 * @param fuelPer100km chi phí nhiên liệu xăng trên 100km
	 */
	public Car(String model, int madeYear, double price, Manufactor manufactor, int noSeats, int maxSpeed,
			int fuelPer100km) {
		super(model, madeYear, price, manufactor);
		this.noSeats = noSeats;
		this.maxSpeed = maxSpeed;
		this.fuelPer100km = fuelPer100km;
	}
	@Override
	public String toString() {
		return "Car: "+"noSeats:" +noSeats + ", maxSpeed:" + maxSpeed + ", fuelPer100km:" + fuelPer100km + " "+super.toString();
	}
	
	@Override
	public double discount() {
		// TODO Auto-generated method stub
		return this.getPrice();
	}
	
}
