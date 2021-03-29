
package com.asim.services.employeeservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0-M2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeService", targetNamespace = "http://services.jets.iti.gov.eg/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEmployee", targetNamespace = "http://services.jets.iti.gov.eg/", className = "com.asim.services.employeeservice.AddEmployee")
    @ResponseWrapper(localName = "addEmployeeResponse", targetNamespace = "http://services.jets.iti.gov.eg/", className = "com.asim.services.employeeservice.AddEmployeeResponse")
    @Action(input = "http://services.jets.iti.gov.eg/EmployeeService/addEmployeeRequest", output = "http://services.jets.iti.gov.eg/EmployeeService/addEmployeeResponse")
    public boolean addEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        Employee arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteEmployee", targetNamespace = "http://services.jets.iti.gov.eg/", className = "com.asim.services.employeeservice.DeleteEmployee")
    @ResponseWrapper(localName = "deleteEmployeeResponse", targetNamespace = "http://services.jets.iti.gov.eg/", className = "com.asim.services.employeeservice.DeleteEmployeeResponse")
    @Action(input = "http://services.jets.iti.gov.eg/EmployeeService/deleteEmployeeRequest", output = "http://services.jets.iti.gov.eg/EmployeeService/deleteEmployeeResponse")
    public boolean deleteEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateEmployee", targetNamespace = "http://services.jets.iti.gov.eg/", className = "com.asim.services.employeeservice.UpdateEmployee")
    @ResponseWrapper(localName = "updateEmployeeResponse", targetNamespace = "http://services.jets.iti.gov.eg/", className = "com.asim.services.employeeservice.UpdateEmployeeResponse")
    @Action(input = "http://services.jets.iti.gov.eg/EmployeeService/updateEmployeeRequest", output = "http://services.jets.iti.gov.eg/EmployeeService/updateEmployeeResponse")
    public boolean updateEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        Employee arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.asim.services.employeeservice.Employee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmployee", targetNamespace = "http://services.jets.iti.gov.eg/", className = "com.asim.services.employeeservice.GetEmployee")
    @ResponseWrapper(localName = "getEmployeeResponse", targetNamespace = "http://services.jets.iti.gov.eg/", className = "com.asim.services.employeeservice.GetEmployeeResponse")
    @Action(input = "http://services.jets.iti.gov.eg/EmployeeService/getEmployeeRequest", output = "http://services.jets.iti.gov.eg/EmployeeService/getEmployeeResponse")
    public Employee getEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
