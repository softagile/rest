package sample.hello.resources;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/file")
public class FileServiceResource {
 
	private static final String FILE_PATH = "c:\\dev\\BahmanKalaliResume.docx";
 
	@GET
	@Path("/get")
	@Produces("text/plain")
	public Response getFile() { 
		File file = new File(FILE_PATH);
		ResponseBuilder response = Response.ok((Object)file);
		response.header("Content-Disposition",
			"attachment; filename=\"BahmanKalaliResume.docx\"");
		return response.build();
 
	}
 
}
