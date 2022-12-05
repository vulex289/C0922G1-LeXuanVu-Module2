package case_study.models.Facility;

public abstract class Facility {
    private String id;

    private String nameService;
    private int areaRoom;
    private double cost;
    private int maxPeople;

    private String rentType;
    Facility(String id,String nameService, int areaRoom, double cost, int maxPeople,String rentType) {
        this.id=id;
        this.nameService = nameService;
        this.areaRoom = areaRoom;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType=rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getAreaRoom() {
        return areaRoom;
    }

    public void setAreaRoom(int areaRoom) {
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
        return "id=" + id +
                ", nameService='" + nameService + '\'' +
                ", areaRoom='" + areaRoom + '\'' +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'';
    }

}
