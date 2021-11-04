package org.ggranados.java.jaxrs.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rest")
public class ApplicationResource {

    @GET
    @Path("/sayhi")
    public Response sayHi(){
        return Response.status(Response.Status.OK)
                .entity("Hi, world")
                .build();
    }
}