package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {

    public void insert(Customer customer) throws SQLException;

    public Customer findByID(int id);

    public List<Customer> findAll();

    public List<Customer> findByName(String Name);

    public Customer findIndexByName(int id);

    public  boolean delete(int id) throws SQLException;

    public  boolean updateUser(Customer customer) throws SQLException;

    void update(Customer customer);

    List<Customer> edit(Customer customer);
}
