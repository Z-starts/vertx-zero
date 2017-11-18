package org.di;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.zero.tool.Jackson;
import org.tlk.api.User;

import javax.ws.rs.BodyParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@EndPoint
public class InjectApi {

    @POST
    @Path("/async/inject")
    @Address("ZERO://INJECT")
    public String sendAsync(
            @BodyParam final User user) {
        final String response = Jackson.serialize(user);
        return response;
    }
}