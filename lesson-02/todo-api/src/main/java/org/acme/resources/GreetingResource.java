package org.acme.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.model.Pessoa;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path(value = "/pessoa")
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa pessoa() {
        return new Pessoa("João", 30);
    }
}
