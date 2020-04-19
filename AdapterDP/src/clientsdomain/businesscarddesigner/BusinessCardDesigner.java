/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsdomain.businesscarddesigner;

import clientsdomain.customer.Customer;

/**
 *
 * @author urosv
 * 
 * Client code which requires Customer interface.
 */
public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
     }

}
