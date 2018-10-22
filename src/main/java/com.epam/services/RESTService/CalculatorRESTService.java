package com.epam.services.RESTService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.DecimalFormat;
import java.text.NumberFormat;

@Path("/calc")
public class CalculatorRESTService {
    static NumberFormat formatter = new DecimalFormat("#0.0000");
    public double result;

    @GET
    @Path("/add/{firstNumber}/{secondNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response Add(@PathParam("firstNumber") double firstNumber, @PathParam("secondNumber") double secondNumber) {
            result = firstNumber + secondNumber;
            return Response.ok().entity(formatter.format(result)).build();

    }

    @GET
    @Path("/subtract/{firstNumber}/{secondNumber}")
    public String Sub(@PathParam("firstNumber") double firstNumber, @PathParam("secondNumber") double secondNumber) {
        try {
            result = firstNumber - secondNumber;
            return formatter.format(result);
        } catch (Exception e) {
            return "Could'nt subtract elements";
        }
    }

    @GET
    @Path("/dividing/{firstNumber}/{secondNumber}")
    public String Div(@PathParam("firstNumber") double firstNumber, @PathParam("secondNumber") double secondNumber) {
        try {
            result = firstNumber / secondNumber;
            return formatter.format(result);
        } catch (Exception e) {
            return "Could'nt divide elements";
        }
    }

    @GET
    @Path("/multiply/{firstNumber}/{secondNumber}")
    public String Mult(@PathParam("firstNumber") double firstNumber, @PathParam("secondNumber") double secondNumber) {
        try {
            result = firstNumber * secondNumber;
            return formatter.format(result);
        } catch (Exception e) {
            return "Could'nt divide elements";
        }
    }

    @GET
    @Path("/percent/{firstNumber}/{secondNumber}")
    public String Percent(@PathParam("firstNumber") double firstNumber, @PathParam("secondNumber") double secondNumber) {
        try {
            result = firstNumber % secondNumber;
            return formatter.format(result);
        } catch (Exception e) {
            return "Could'nt get percent from elements";
        }
    }
}
