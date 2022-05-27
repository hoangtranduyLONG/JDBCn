package controller;

import model.Customer;
import service.CustomerDAO;
import service.ICustomerDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

//import static java.awt.AWTEventMulticaster.save;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    CustomerDAO customerDAO = new CustomerDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("act");
        if (action == null)
        {
            action = "";
        }
        switch (action) {
            case "create":
                showCreatForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            default:
                showList(request, response);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/edit.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerDAO.findIndexByName(id);
        request.setAttribute("customer", customer);
//        int age = Integer.parseInt(request.getParameter("age"));
//        String name = request.getParameter("name");
//        customerDAO.update(new Customer(id, name, age));
        requestDispatcher.forward(request, response);
//        response.sendRedirect("/customers");
    }
    private void showCreatForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
        requestDispatcher.forward(request, response);

    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        List<Customer> customers = customerDAO.findAll();
        request.setAttribute("dskh", customers);
        requestDispatcher.forward(request, response);
    }

      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
          request.setCharacterEncoding("utf-8");
        String action = request.getParameter("act");
        if (action == null)
        {
            action = "";

        }
        switch (action) {
            case "create":
                try {
                    save(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                editCustomer(request, response);
                break;
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        customerDAO.updateCustomer(id, new Customer(id, name, age));
//request.getRequestDispatcher("/customers").forward(request,response);
        response.sendRedirect("/customers");
    }


    private void save(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        int age = Integer.parseInt(request.getParameter("age"));
        String name = request.getParameter("name");
        customerDAO.insert(new Customer( name, age));
        response.sendRedirect("/customers");
    }
}
