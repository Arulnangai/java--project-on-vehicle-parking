package bean;

public class Vehicle {
    private String regNumber;
    private String ownerName;
    private long mobileNumber;

    public Vehicle(String regNumber, String ownerName, long mobileNumber) {
        this.regNumber = regNumber;
        this.ownerName = ownerName;
        this.mobileNumber = mobileNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return
                "regNumber='" + regNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", mobileNumber=" + mobileNumber;
    }
}
