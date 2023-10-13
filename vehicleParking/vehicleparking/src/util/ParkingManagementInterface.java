package util;

import bean.ResidentVehicle;
import bean.Vehicle;
import bean.VisitorVehicle;
import exception.ParkingSlotNotAvailableException;
import exception.VehicleNotFoundException;

import java.util.ArrayList;

public interface ParkingManagementInterface {
    //public void addResidentVehicle(ResidentVehicle residentVehicle);
    //public void addVisitorVehicle(VisitorVehicle visitorVehicle);
    public String addVehicle(Vehicle vehicle) throws ParkingSlotNotAvailableException;
    public void setVisitorVehicleOutTime(String regNumber, int outTime) throws VehicleNotFoundException;
    public int getParkedResidentVehicleCount();
    public ArrayList<Vehicle> displayAllVehiles();
}
