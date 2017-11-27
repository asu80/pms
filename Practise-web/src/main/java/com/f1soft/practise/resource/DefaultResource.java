package com.f1soft.practise.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author asmita.shrestha
 */
@Path("/")
public class DefaultResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String welcome() {
        return "<h1>Backend Server</h1>";
    }
}
