package builder;

public class Car {

	private Integer wheels;
	private String colour;
	
	private boolean gps;
	
	public Car(CarBuilder carBuilder) {
		this.wheels = carBuilder.getWheels();
		this.colour = carBuilder.getColour();
		this.gps = carBuilder.IsGpsEnabled();
	}
	
	public String getColour() {
		return colour;
	}
	
	public static void main (String[] args) {
		
		System.out.println("hello");
		
		Car newCar = new Car.CarBuilder(4, "red").setGpsEnabled(true).build();
		
		System.out.println(newCar.getColour());
		
	}
	
	
	public static class CarBuilder {
		private Integer wheels;
		private String colour;
		
		private boolean gps;
		
		public CarBuilder(Integer wheels, String clour) {
			this.wheels = wheels;
			this.colour = clour;
		}
		
		public Integer getWheels() {
			return wheels;
		}
		
		public String getColour() {
			return colour;
		}
		
		public boolean IsGpsEnabled() {
			return gps;
		}
		
		public CarBuilder setGpsEnabled(boolean gps) {
			this.gps = gps;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}
	
	
}
