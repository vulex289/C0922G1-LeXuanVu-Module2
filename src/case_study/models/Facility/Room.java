package case_study.models.Facility;

import case_study.models.Facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room(int idFacility,String nameService, String areaRoom, double cost, int maxPeople,String rentType, String freeService) {
        super(idFacility,nameService, areaRoom, cost, maxPeople,rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String getLine(){
        return this.getIdFacility()+","+this.getNameService()+","+this.getAreaRoom()+","+this.getCost()+","+this.getMaxPeople()
                +","+this.getRentType()+","+this.freeService;
    }
}
