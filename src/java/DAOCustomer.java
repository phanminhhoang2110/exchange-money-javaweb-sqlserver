
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hoang
 */
public class DAOCustomer extends DAO {

    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        try {
            Connection connection = getConnection();
            String sql = "SELECT Person.BusinessEntityID, FirstName, JobTitle, BirthDate, MaritalStatus, Gender, HireDate\n"
                    + "  FROM [AdventureWorks2019].[Person].[Person] join HumanResources.Employee\n"
                    + "  on Person.BusinessEntityID = Employee.BusinessEntityID";
            PreparedStatement statement = connection.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Customer customer = new Customer();
                customer.setName(rs.getNString("FirstName"));
                customer.setJobtitle(rs.getNString("JobTitle"));
                customer.setBirthday(String.valueOf(rs.getDate("BirthDate")));
                customer.setMarialStatus(rs.getString("MaritalStatus"));
                customer.setGender(rs.getString("Gender"));
                customer.setHireDate(String.valueOf(rs.getDate("HireDate")));
                customers.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }
}

