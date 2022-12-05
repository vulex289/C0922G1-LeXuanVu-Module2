package case_study.services;

import case_study.Exception.ExistException;
import case_study.Exception.NotFoundEmployeeException;

import java.util.List;
import java.util.Map;

public interface Service<O> {
List<O> getInfor();
    void add(O o) throws ExistException;
void update(O o );
void delete(int idCard) throws NotFoundEmployeeException;
    Map<O,Integer> getFacilityMap();

}
