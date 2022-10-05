package car;

public class Car {
	private String make;
	private int numberOfSeats;
	private boolean mappedImplicitly;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public boolean isMappedImplicitly() {
		return mappedImplicitly;
	}

	public void setMappedImplicitly(boolean mappedImplicitly) {
		this.mappedImplicitly = mappedImplicitly;
	}
}
