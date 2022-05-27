package service.impl;

import model.Category;
import service.CategoryService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    public CategoryServiceImpl() {
    }

    protected static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2006?useSSL=false", "root", "123456");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void insert(Category category) throws SQLException {

    }

    @Override
    public Category findByID(int id) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public List<Category> findByName(String Name) {
        return null;
    }

    @Override
    public List<Category> findAllOrderByAge() {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(Category category) throws SQLException {
        return false;
    }
}
