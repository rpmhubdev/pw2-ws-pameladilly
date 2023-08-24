package dev.rpmhub;

import jakarta.ws.rs.*;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
public class Start {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy";
    }

    @POST
    @Path("/kmh2mih")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String KilometerHourToMilesHour(@FormParam("kmh") Double kilometer ) {

        return String.valueOf(kilometer * 0.621);

    }

    @GET
    @Path("/no2kmh/{n}")
    @Produces(MediaType.APPLICATION_JSON)
    public String  NoToKm(@PathParam("n") Double no){
        Dto dto = Dto.builder().kmH(no * 1.852).build();
        return  String.valueOf(dto.getKmH());

    }
}
