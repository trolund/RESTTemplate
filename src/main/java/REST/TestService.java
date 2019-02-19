package REST;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestService {

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String Test() {
        return "test virker";
    }

}
