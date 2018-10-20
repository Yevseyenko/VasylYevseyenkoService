package com.epam;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class CalculatorSOAPService {
    public double firstNumber;
    public double secondNumber;
    public double result;

    @WebMethod(operationName = "Adding")
    public double Add(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber + secondNumber;
        return result;
    }

    @WebMethod(operationName = "Subtract")
    public double Sub(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber - secondNumber;
        return result;
    }

    @WebMethod(operationName = "Dividing")
    public double Div(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber / secondNumber;
        return result;
    }

    @WebMethod(operationName = "Multiplying")
    public double Mult(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber * secondNumber;
        return result;
    }

    @WebMethod(operationName = "Percent")
    public double Percent(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber % secondNumber;
        return result;
    }
}
