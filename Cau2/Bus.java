package Cau2;

public class Bus extends AVehicle {
	private int noSeats;

	/**
	 * @param model nhan hieu
	 * @param madeYear nam san xuat
	 * @param price gia goc
	 * @param manufactor Hang san xuat
	 * @param noSeats so cho ngoi
	 */
	public Bus(String model, int madeYear, double price, Manufactor manufactor, int noSeats) {
		super(model, madeYear, price, manufactor);
		this.noSeats = noSeats;
	}

	@Override
	public String toString() {
		return "Bus: noSeats:" + noSeats + " "+super.toString();
	}

	@Override
	public double discount() {
		// TODO Auto-generated method stub
		return this.getPrice()-1000;
	}


	
}
