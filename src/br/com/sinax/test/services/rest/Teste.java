package br.com.sinax.test.services.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/tt")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class Teste {
    @GET
    @Produces("application/json")
    public Response defaultReverser() throws JSONException {
 
        StringBuilder sb = new StringBuilder();
        sb.append("ANKARA");
 
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("original", sb.toString());
        jsonObject.put("reversed", sb.reverse().toString());
 
        String result = "" + jsonObject;
        return Response.status(200).entity(result).build();
    }
 
	@Path("/{word}")
    @GET
    @Produces("application/json")
    public Response reverser(@PathParam("word") String word) throws JSONException {
 
        StringBuilder sb = new StringBuilder();
        sb.append(word);
 
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("original", sb.toString());
        jsonObject.put("reversed", sb.reverse().toString());
 
        String result = "" + jsonObject;
        return Response.status(200).entity(result).build();
    }
}
