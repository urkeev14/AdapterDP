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
public class EmployeeClassAdapter extends Employee implements Customer{

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
    
}
