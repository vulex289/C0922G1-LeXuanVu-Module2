package case_study.services;

import case_study.models.Facility.Facility;

import java.util.List;

public interface Service<O> {
List<O> getInfor();
    void add(O o) ;
void update(O o );
void delete(int idCard);
}
