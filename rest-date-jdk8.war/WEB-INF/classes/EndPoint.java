package org.resteasy.simple.deployment;

import org.resteasy.simple.deployment.model.Person;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;
import java.time.DayOfWeek;
import java.time.Duration;
import java.util.Date;
import java.util.Optional;

@Path("/sample")
public class EndPoint {

    @GET
    @Path("entity/get/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getJson(@QueryParam("boolean") @DefaultValue("false") boolean v) {
        Person per = new Person();
        per.setName("per");
        per.setFamily("son");
        per.setDate(new Date());
        per.setDuration(Duration.ofSeconds(5, 6));
        per.setDayOfWeek(DayOfWeek.FRIDAY);
        per.setEmail(Optional.of("info@example.com"));
        return per;
    }
}