package case_study.models.Facility;

public abstract class Facility {

    private int idFacility;
    private String nameService;
    private String areaRoom;
    private double cost;
    private int maxPeople;

    private String rentType;
    Facility(int idFacility,String nameService, String areaRoom, double cost, int maxPeople,String rentType) {
        this.idFacility=idFacility;
        this.nameService = nameService;
        this.areaRoom = areaRoom;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType=rentType;
    }

    public int getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(int idFacility) {
        this.idFacility = idFacility;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreaRoom() {
        return areaRoom;
    }

    public void setAreaRoom(String areaRoom) {
        this.areaRoom = areaRoom;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    @Override
    public String toString() {
        return
                "idFacility=" + idFacility +
                ", nameService='" + nameService + '\'' +
                ", areaRoom='" + areaRoom + '\'' +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'';

    }
}
