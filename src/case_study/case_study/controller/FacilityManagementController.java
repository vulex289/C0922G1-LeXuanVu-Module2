package case_study.case_study.controller;

import case_study.models.Facility.Facility;
import case_study.models.Facility.Room;
import case_study.models.Facility.Villa;
import case_study.services.impl.FacilityServiceImpl;

import java.util.Map;

public class FacilityManagementController {
    FacilityServiceImpl facilityService=new FacilityServiceImpl();
    public Map<Facility, Integer> getInfor1() {
        return this.facilityService.getFacilityMap();
    }
    public void showFacilityMaintenance(){
       this.facilityService.showFacilityMaintenance();
    }
    public void addNewRoom(Room room){
        this.facilityService.addNewRoom(room);
    }
    public void addNewVilla(Villa villa){
        this.facilityService.addNewVilla(villa);
    }
}
