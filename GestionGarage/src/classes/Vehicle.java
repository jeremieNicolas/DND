package classes;

import java.util.List;

public class Vehicle {
	String vehicleID;
	String make;
	String model;
	String year;
	String licensePlate;
	Client owner;
	List<Repair> listRepair; 
	
	Vehicle(){}
	
	Vehicle(String vehicleID, String make, String model, String year, String licensePlate, Client owner)
	{
		this.vehicleID = vehicleID;
		this.make = make;
		this.model = model;
		this.year = year;
		this.licensePlate = licensePlate;
		this.owner = owner;
	}

	public String getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Client getOwner() {
		return owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
	}

	public List<Repair> getListRepair() {
		return listRepair;
	}

	public void setListRepair(List<Repair> listRepair) {
		this.listRepair = listRepair;
	}
	
}
