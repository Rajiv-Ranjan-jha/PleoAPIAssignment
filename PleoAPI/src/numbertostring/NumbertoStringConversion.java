package numbertostring;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/NumberToString")
public class NumbertoStringConversion {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String NumbertoStringHTML(@QueryParam("number") String number) {
		
		return number;
	}

}
