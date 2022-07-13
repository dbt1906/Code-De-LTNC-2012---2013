package Cau2;

public class Manufactor {
	private String companyName;
	private String country;
	/**
	 * @param companyName ten cong ty
	 * @param country ten quoc gia
	 */
	public Manufactor(String companyName, String country) {
		this.companyName = companyName;
		this.country = country;
	}
	@Override
	public String toString() {
		return "companyName:" + companyName + ", country:" + country;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	
}
