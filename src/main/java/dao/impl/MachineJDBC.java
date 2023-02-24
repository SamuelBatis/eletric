package dao.impl;

import dao.MachineDao;
import db.DbException;
import etities.Machine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MachineJDBC implements MachineDao {

  private Connection conn;

  public MachineJDBC(Connection conn) {
    this.conn = conn;
  }

  @Override
  public void insert(Machine obj) {
    PreparedStatement st = null;

    try {
      st = conn.prepareStatement("INSERT INTO Machine (machineName, powerWats, hoursPerDay)" +
          "VALUES" +
          "(?, ?, ?)"
      );

      st.setString(1, obj.getMachineName());
      st.setDouble(2, obj.getPowerWats());
      st.setInt(3, obj.getHourPerDay());

      int rows = st.executeUpdate();
      System.out.println("Machine register " + obj.getMachineName());
    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    }

  }

  @Override
  public void update(Machine obj) {

  }

  @Override
  public void delete(Integer id) {

  }

  @Override
  public Machine findById(Integer id) {
    return null;
  }
}
