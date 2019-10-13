package mx.com.kabec;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int VehicleId;

	public Vehicle(int vehicleId) {
		super();
		VehicleId = vehicleId;
	}

	public int getVehicleId() {
		return VehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + "]";
	}
}

class Car extends Vehicle {
	private String CarModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		CarModel = carModel;
	}

	public String getCarModel() {
		return CarModel;
	}

	@Override
	public String toString() {
		return "Car [CarModel=" + CarModel + "]";
	}

}

class Truck extends Vehicle{
	private String truckModel;

	public Truck(int vehicleId, String truckModel) {
		super(vehicleId);
		this.truckModel=truckModel;
	}

	public String getTruckModel() {
		return truckModel;
	}

	@Override
	public String toString() {
		return "Truck [truckModel=" + truckModel + "]";
	}
	
	
}

public class App {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14, "A14"));
		list.add(new Truck(15, "Chevrolet Cheyenne"));
		list.add(new Truck(16, "Ford Lobo"));
		display(list);

	}

	public static void display(List<?> list) {
		for (Object element : list) {
			System.out.println(element);
		}
	}
}