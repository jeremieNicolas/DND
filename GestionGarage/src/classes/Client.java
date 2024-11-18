package classes;

import java.util.ArrayList;
import java.util.List;

public class Client {
	String clientID;
	String name;
	String contactInfo;
	List<Vehicle> vehicleIDs;
	
	
	Client(){}
	
	Client(String clientID, String name, String contactInfo)
	{
		this.clientID = clientID;
		this.name = name;
		this.contactInfo = contactInfo;
		this.vehicleIDs = new ArrayList<Vehicle>();
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public List<Vehicle> getVehicleIDs() {
		return vehicleIDs;
	}

	public void setVehicleIDs(List<Vehicle> vehicleIDs) {
		this.vehicleIDs = vehicleIDs;
	}
	
}	
