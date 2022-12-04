package case_study.models.Facility;

import case_study.models.Facility.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int floorNumber;
    public Villa(int idFacility,String nameService, String areaRoom, double cost, int maxPeople,String rentType,String roomStandard,double areaPool,int floorNumber) {
        super(idFacility,nameService, areaRoom, cost, maxPeople,rentType);
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
    public String getLine(){
        return this.getIdFacility()+","+this.getNameService()+","+this.getAreaRoom()+","+this.getCost()+","+this.getMaxPeople()
                +","+this.getRentType()+","+this.getRoomStandard()+","+this.getAreaPool()+","+this.floorNumber;
    }
}
