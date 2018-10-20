package com.epam;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.text.DecimalFormat;
import java.text.NumberFormat;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class CalculatorSOAPService {
    public double firstNumber;
    public double secondNumber;
    public double result;
    NumberFormat formatter = new DecimalFormat("#0.0000");

    @WebMethod(operationName = "Adding")
    public String Add(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber + secondNumber;
        return formatter.format(result);
    }

    @WebMethod(operationName = "Subtract")
    public String Sub(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber - secondNumber;
        return formatter.format(result);
    }

    @WebMethod(operationName = "Dividing")
    public String Div(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber / secondNumber;
        return formatter.format(result);
    }

    @WebMethod(operationName = "Multiplying")
    public String Mult(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber * secondNumber;
        return formatter.format(result);
    }

    @WebMethod(operationName = "Percent")
    public String Percent(@WebParam(name = "firstNumber") double firstNumber, @WebParam(name = "secondNumber") double secondNumber) {
        result = firstNumber % secondNumber;
        return formatter.format(result);
    }
}
