package service;

import model.Customer;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    public ProductServiceImpl() {
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
    public void insert(Product product) throws SQLException {

    }

    @Override
    public Product findByID(int id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement("select * from product")) {
//            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price  = rs.getInt("price");
                int categoryId =Integer.parseInt(rs.getString("categoryId"));
                products.add(new Product(id, name,price,categoryId));
            }
        } catch (SQLException e) {

        }
        return products;
    }

    @Override
    public List<Product> findByName(String Name) {
        return null;
    }

    @Override
    public List<Product> findAllOrderByAge() {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(Product product) throws SQLException {
        return false;
    }
}
