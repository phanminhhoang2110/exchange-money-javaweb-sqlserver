
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hoang
 */
@XmlRootElement(name = "customers")
public class CustomerList {

    List<Customer> customers;

    public CustomerList() {
        customers = new ArrayList<>();
    }

    public CustomerList(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    @XmlElement(name = "customer")
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
