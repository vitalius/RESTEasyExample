package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/movies")
public class MovieService {

	@GET
	@Path("/allmovies")
	public String start() {
		return "RESTEasy three different web.xml file...";
	}
}
