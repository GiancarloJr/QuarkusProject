package project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/hello")
public class GreetingResource {

    public List<String> teste = new ArrayList<>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello() {
        teste.add("Teste");
        return Response.ok(teste).build();
    }
}