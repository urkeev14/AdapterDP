/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydomain.employee;

import clientsdomain.customer.Customer;

/**
 *
 * @author urosv
 */
public class EmployeeObjectAdapter implements Customer {

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }

}
