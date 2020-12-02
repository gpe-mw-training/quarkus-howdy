package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class GreetingResource {

    @GET
    @Path("/howdy")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello my friend!";
    }
}