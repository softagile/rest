package sample.hello.resources;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/books")
public class BookService {

	@GET
	@Path("{year}")
	public Response getBooks(@PathParam("year") String year,
			@MatrixParam("author") String author,
			@MatrixParam("country") String country) {

		CacheControl cacheControl = new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);
		
		ResponseBuilder builder = Response.status(200);
		
		builder.cacheControl(cacheControl);
		builder.entity("getBooks is called, year : " + year + ", author : "
				+ author + ", country : " + country);
		Response response = builder.build();
		return response;

	}

}