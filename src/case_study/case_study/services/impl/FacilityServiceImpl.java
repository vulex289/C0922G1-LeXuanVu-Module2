package case_study.case_study.services.impl;

import case_study.FileUtils.ReadAndWriteRoom;
import case_study.FileUtils.ReadAndWriteVilla;
import case_study.models.Facility.Facility;
import case_study.models.Facility.Room;
import case_study.models.Facility.Villa;
import case_study.services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {

    public static final String FILE_NAME_ROOM = "src/case_study/data/Room.csv";
    public static final String FILE_NAME_VILLA = "src/case_study/data/Villa.csv";
    private final ReadAndWriteVilla readAndWriteVilla=new ReadAndWriteVilla();
    private final ReadAndWriteRoom readAndWriteRoom=new ReadAndWriteRoom();

    @Override
    public List<Facility> getInfor() {
        return null;
    }
    @Override
    public void add(Facility facility) {
    }
    @Override
    public void update(Facility facility) {
    }
    @Override
    public void delete(int idCard) {
    }
    @Override
    public Map<Facility, Integer> getFacilityMap() {
       Map<Facility,Integer>facilityIntegerMap=new LinkedHashMap<>();
       facilityIntegerMap.putAll(readAndWriteVilla.read(FILE_NAME_VILLA));
       facilityIntegerMap.putAll(readAndWriteRoom.read(FILE_NAME_ROOM));
       return facilityIntegerMap;
    }
    public void addNewVilla(Villa villa) {
        Map<Villa, Integer> villaIntegerMap = readAndWriteVilla.read(FILE_NAME_VILLA);
        villaIntegerMap.put(villa,0);
            readAndWriteVilla.write(FILE_NAME_VILLA, villaIntegerMap);
        }
    public void addNewRoom(Room room) {
        Map<Room, Integer> roomIntegerMap = readAndWriteRoom.read(FILE_NAME_ROOM);
        roomIntegerMap.put(room,0);
        readAndWriteRoom.write(FILE_NAME_ROOM, roomIntegerMap);
        }
    public void showFacilityMaintenance() {
        Map<Facility,Integer>facilityLinkedHashMap=getFacilityMap();
        int count=0;
        for (Map.Entry<Facility,Integer>element:facilityLinkedHashMap.entrySet()) {
            if(element.getValue()>=5){
                System.out.println(element.getKey()+",amount rented= "+element.getValue()+"]");
                count++;
            }
        }
        if (count == 0){
            System.out.println("Not facility need to maintain");
        }
    }
}