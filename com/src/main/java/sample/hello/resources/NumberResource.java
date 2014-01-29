package sample.hello.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/math")
public class NumberResource {


	@GET
	@Path("/divisibleBy3And5/{number}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response isVisibleBy3And5(@PathParam("number") int number) {
		String result = null;
		if (number % 3 == 0 && number % 5 == 0) {
			result= "number=" + number  + " divisible by 3 & 5";
		} else if (number % 3 == 0 && number % 5 != 0) {
			result= "number=" + number  + " divisible by  3";
		} else if (number % 3 != 0 && number % 5 == 0) {
			result= "number=" + number  + " divisible by  5";
		} else {
			result= "number=" + number  + " is not divisible  3 & 5";
		}
		return Response.status(200).entity(result).build();
	}
	
}