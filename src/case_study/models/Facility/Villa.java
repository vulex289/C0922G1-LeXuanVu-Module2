package case_study.models.Facility;

import case_study.models.Facility.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int floorNumber;
    public Villa(String id,String nameService, int areaRoom, double cost, int maxPeople,String rentType,String roomStandard,double areaPool,int floorNumber) {
        super(id,nameService, areaRoom, cost, maxPeople,rentType);
        this.roomStandard=roomStandard;
        this.areaPool=areaPool;
        this.floorNumber=floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", floorNumber=" + floorNumber +
                '}';
    }
    public StringBuilder getLine(){
       return new StringBuilder().append(this.getId()).append(",").append(this.getNameService()).
               append(",").append(this.getAreaRoom()).append(",").append(this.getCost()).append(",").
               append(this.getMaxPeople()).append(",").append(this.getRentType()).append(",").
               append(this.getRoomStandard()).append(",").append(this.getAreaPool()).append(",").append(this.floorNumber);
    }
}
