package case_study.services;

import case_study.Exception.ExistException;
import case_study.Exception.NotFoundObjectException;

import java.util.List;

public interface IService<O> {
  List<O> getInfor();
    void add(O o) throws ExistException;
void update(O o );
void delete(int idCard) throws NotFoundObjectException, ExistException;
}
