package service;

import bean.ResidentVehicle;
import bean.Vehicle;
import bean.VisitorVehicle;
import exception.ParkingSlotNotAvailableException;
import exception.VehicleNotFoundException;
import util.ParkingManagementInterface;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ParkingManagement implements ParkingManagementInterface {

    ArrayList<ResidentVehicle> residentVehicleList = new ArrayList<>();

    ArrayList<VisitorVehicle> visitorVehicleList = new ArrayList<>();
    static int slot = 1;


    @Override
    public String addVehicle(Vehicle vehicle) throws ParkingSlotNotAvailableException {

        if(ParkingManagement.slot <= 5 )
        {
            if(vehicle.getClass().getName().equalsIgnoreCase("bean.ResidentVehicle"))
            {
            ResidentVehicle res = (ResidentVehicle) vehicle;
            residentVehicleList.add(res);
            }
           if(vehicle.getClass().getName().equalsIgnoreCase("bean.VisitorVehicle"))
            {
              visitorVehicleList.add((VisitorVehicle) vehicle);
            }
           return "Vehicle parked at Parking Slot no : "+(ParkingManagement.slot++);
        }

        else
        {
            throw new ParkingSlotNotAvailableException();
        }
    }

    @Override
    public void setVisitorVehicleOutTime(String regNumber, int outTime) throws VehicleNotFoundException {
        for (VisitorVehicle v : visitorVehicleList) {
            if ((v.getRegNumber().equalsIgnoreCase(regNumber)))
            {
                v.setOutTime(outTime);
                System.out.println("Vehicle with Reg Number : " + v.getRegNumber() + "updated successfully");
            }
            else
            {
                throw new VehicleNotFoundException(regNumber);
            }
        }
    }

    @Override
    public int getParkedResidentVehicleCount() {
        int count = 0;
        for(ResidentVehicle r: residentVehicleList)
        {
            //System.out.println(r);
            if(r.isParkingStatus() == true)
            {
                count++;
            }
        }
        return count;
    }

    @Override
    public ArrayList<Vehicle> displayAllVehiles() {
        ArrayList<Vehicle> allVehicles = new ArrayList<>();
        for(ResidentVehicle v : residentVehicleList)
        {
            Vehicle vh = new Vehicle(v.getRegNumber(),v.getOwnerName(),v.getMobileNumber());
            allVehicles.add(vh);
        }
        for(VisitorVehicle v : visitorVehicleList)
        {
            Vehicle vh = new Vehicle(v.getRegNumber(),v.getOwnerName(),v.getMobileNumber());
            allVehicles.add(vh);
        }

        return allVehicles;
    }
}
