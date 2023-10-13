package bean;

public class VisitorVehicle extends Vehicle{

    private int visitingFlatNumber;
    private int inTime;
    private int outTime;

    public VisitorVehicle(String regNumber, String ownerName, long mobileNumber, int visitingFlatNumber, int inTime) {
        super(regNumber, ownerName, mobileNumber);
        this.visitingFlatNumber = visitingFlatNumber;
        this.inTime = inTime;
    }

    public int getVisitingFlatNumber() {
        return visitingFlatNumber;
    }

    public void setVisitingFlatNumber(int visitingFlatNumber) {
        this.visitingFlatNumber = visitingFlatNumber;
    }

    public int getInTime() {
        return inTime;
    }

    public void setInTime(int inTime) {
        this.inTime = inTime;
    }

    public int getOutTime() {
        return outTime;
    }

    public void setOutTime(int outTime) {
        this.outTime = outTime;
    }

    @Override
    public String toString() {
        return "VisitorVehicle{" +
                "visitingFlatNumber=" + visitingFlatNumber +
                ", inTime=" + inTime +
                ", outTime=" + outTime + super.toString()+
                '}';
    }
}
