package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface GeneralService<T> {
   public void insert(T t) throws SQLException;

    public T findByID(int id);

    public  List<T> findAll();

    public List<T> findByName(String Name);

    public  List<T> findAllOrderByAge();

    public boolean delete(int id) throws SQLException;

    public  boolean updateUser(T t) throws SQLException;
}
