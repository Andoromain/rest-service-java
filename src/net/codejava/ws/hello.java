package net.codejava.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bonjour")
public class hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "Bonjour TOut le monde";
	}
}
