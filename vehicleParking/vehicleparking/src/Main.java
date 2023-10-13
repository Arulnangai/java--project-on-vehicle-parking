import bean.ResidentVehicle;
import bean.VisitorVehicle;
import exception.ParkingSlotNotAvailableException;
import exception.VehicleNotFoundException;
import service.ParkingManagement;

public class Main {
    public static void main(String[] args) {



        ParkingManagement pm = new ParkingManagement();


        try {
            ResidentVehicle rv1 = new ResidentVehicle("TN49A2222", "Senthil", 12121212, 201, true);
            ResidentVehicle rv2 = new ResidentVehicle("TN49B4444", "Ragavan", 14141414, 202, false);
            ResidentVehicle rv3 = new ResidentVehicle("TN49C6666", "Srimathi", 16161616, 204, true);

            System.out.println(pm.addVehicle(rv1));

            System.out.println(pm.addVehicle(rv2));
            System.out.println(pm.addVehicle(rv3));
            VisitorVehicle vv1 = new VisitorVehicle("TN49A1111","Senthil",12121212,201,9);
            VisitorVehicle vv2 = new VisitorVehicle("TN49A3333","Ragavan",14141414,202,8);
            VisitorVehicle vv3 = new VisitorVehicle("TN49A5555","Srimathi",16161616,204,15);

            System.out.println(pm.addVehicle(vv1));
            System.out.println(pm.addVehicle(vv2));
            System.out.println(pm.addVehicle(vv3));


        } catch (ParkingSlotNotAvailableException pk) {
            System.out.println(pk+" No Parking Slots Available");
        }

       // pm.display();

        try {
            pm.setVisitorVehicleOutTime("TN49A1111", 4);
            pm.setVisitorVehicleOutTime("TN49b5555",9);
        }catch (VehicleNotFoundException ve)
        {
            System.out.println("Searched Vehicle Not Found : " + ve.getMessage());
        }

        int a = pm.getParkedResidentVehicleCount();
        System.out.println("Total resident vehicle parked is : "+a);

    }
}