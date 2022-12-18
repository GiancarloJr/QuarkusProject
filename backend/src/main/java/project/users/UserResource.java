package project.users;

import project.users.dto.UserRequest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource {

    @POST
    public Response createUser(UserRequest userRequest) {
        return Response.ok().build();
    }
}
