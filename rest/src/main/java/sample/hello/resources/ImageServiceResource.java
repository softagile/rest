package sample.hello.resources;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/pdf")
public class ImageServiceResource {
 
	private static final String FILE_PATH = "c:\\dev\\I-9 Form-Bahman-Kalali.pdf";
 
	@GET
	@Path("/get")
	@Produces("application/pdf")
	public Response getFile() {
 
		File file = new File(FILE_PATH);
 
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=I-9 Form-Bahman-Kalali.pdf");
		return response.build();
 
	}
 
}
