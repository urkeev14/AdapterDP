/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clientsdomain.businesscarddesigner.BusinessCardDesigner;
import mydomain.employee.Employee;
import mydomain.employee.EmployeeClassAdapter;
import mydomain.employee.EmployeeObjectAdapter;

/**
 *
 * @author urosv
 */
public class Start {

    public static void main(String[] args) {

        BusinessCardDesigner designer = new BusinessCardDesigner();

        adaptingWithClassAdaptor(designer);
        System.out.println("=========================");
        adaptingWithObjectAdaptor(designer);
        
    }

    private static void adaptingWithClassAdaptor(BusinessCardDesigner designer) {
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
        firstWay(classAdapter);
        String card = secondWay(designer, classAdapter);
        System.out.println(card);
    }

    private static void adaptingWithObjectAdaptor(BusinessCardDesigner designer) {
        String card;
        
        Employee employee = new Employee();
        populateEmployeeData(employee);
        
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        
        card = designer.designCard(objectAdapter);
        
        System.out.println(card);
    }

    private static String secondWay(BusinessCardDesigner designer, EmployeeClassAdapter classAdapter) {
        String card = designer.designCard(classAdapter);
        return card;
    }

    private static void firstWay(EmployeeClassAdapter classAdapter) {
        populateEmployeeData(classAdapter); //first way
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Uros Veljkovic");
        employee.setJobTitle("Developer");
        employee.setOfficeLocation("Mitropolita Pavla Nenadovica 33");
    }

}
