package org.ggranados.java.jaxrs.resources;

import org.ggranados.java.jaxrs.entities.Address;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.ggranados.java.jaxrs.entities.Address.getAddressList;

@Path("/rest")
public class ApplicationResource {

    @GET
    @Path("/sayhi")
    public Response sayHi(){
        return Response.status(Response.Status.OK)
                .entity("Hi, world")
                .build();
    }

    @GET
    @Path("/addresses")
    @Produces("application/json")
    public Response getAddresses(){
        return Response.status(Response.Status.OK)
                .entity(getAddressList())
                .build();
    }


}