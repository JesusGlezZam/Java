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


class Peugeot extends Car{
	private String peugeotModel;
	
	public Peugeot(int vehicleId, String carModel, String peugeotModel) {
		super(vehicleId, carModel);
		this.peugeotModel=peugeotModel;
	}

	public String getPeugeotModel() {
		return peugeotModel;
	}

	@Override
	public String toString() {
		return "Peugeot [peugeotModel=" + peugeotModel + "]";
	}
	
	
}


public class App {
	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14, "A14"));
		list.add(new Peugeot(15, "Peugeot", "3008"));
		display(list);

	}

	public static void display(List<? super Car> list) {
		for (Object element : list) {
			System.out.println(element);
		}
	}
}
