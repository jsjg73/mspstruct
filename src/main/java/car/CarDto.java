package car;

public class CarDto {
	private String manufacturer;
	private int seatCount;
	private boolean mappedImplicitly;

	public boolean isMappedImplicitly() {
		return mappedImplicitly;
	}

	public void setMappedImplicitly(boolean mappedImplicitly) {
		this.mappedImplicitly = mappedImplicitly;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
}
