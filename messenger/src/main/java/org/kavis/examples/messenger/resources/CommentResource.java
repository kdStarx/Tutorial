package org.kavis.examples.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class CommentResource {

	@GET
	public String test() {
		return "new Sub resource";
	}

}
