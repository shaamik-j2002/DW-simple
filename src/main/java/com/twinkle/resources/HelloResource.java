package com.twinkle.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {

    @GET
    public Response handleRootPath() {
        return Response.ok().build();
    }

    @GET
    @Path("/hello")
    public Response hello() {
        return Response.ok("{ message: \"Hello World!\" }").build();
    }
}
