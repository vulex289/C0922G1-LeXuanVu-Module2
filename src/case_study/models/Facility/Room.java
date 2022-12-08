package case_study.models.Facility;

public class Room extends Facility {
    private String freeService;

    public Room(String id,String nameService, int areaRoom, double cost, int maxPeople,String rentType, String freeService) {
        super(id,nameService, areaRoom, cost, maxPeople,rentType);
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
    public StringBuilder getLine(){
//        return this.getId()+","+ this.getNameService()+","+this.getAreaRoom()+","+this.getCost()+","+this.getMaxPeople()
//                +","
//                +this.getRentType()+","+this.getFreeService();
        StringBuilder stringBuilder=new StringBuilder();
         stringBuilder.append(this.getId()).append(",").append(this.getNameService()).append(",").
                 append(this.getAreaRoom()).append(",").append(this.getCost()).append(",").
                append(this.getMaxPeople()).append(",").append(this.getRentType()).append(",").append(this.getFreeService());
         return stringBuilder;
    }
}
