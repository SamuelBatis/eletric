package dao;

import etities.Machine;

public interface MachineDao {

  void insert(Machine obj);
  void update(Machine obj);
  void delete(Integer id);
  Machine findById(Integer id);
}
