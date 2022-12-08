package case_study.services;

import case_study.models.Facility.Facility;

import java.util.Map;

public interface IFacilityService extends IService<Facility> {
    Map<Facility,Integer> getFacilityMap();
}
