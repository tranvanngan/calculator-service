package vn.edu.ueh.bit.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;
import jakarta.xml.ws.soap.SOAPBinding;

@WebService
@BindingType(SOAPBinding.SOAP11HTTP_BINDING)
public class CalculatorWsImpl implements CalculatorWs {

    @WebMethod
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @WebMethod
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @WebMethod
    public double multiply(int num1, int num2) {
        return (double) num1 * num2;
    }

    @WebMethod
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("you cannot divide by zero");
        }
        return (double) num1 / num2;
    }
}