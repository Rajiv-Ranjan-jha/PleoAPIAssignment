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
		Double numParsed = Double.parseDouble(number);
		/* Converting into required formate and rounding off the last two digit post decimal */
		String result = String.format("%,.2f", numParsed);
		
		/* Replacing "," with spaces as its required that formate */
		if(result.indexOf(",")!=-1) { 
			result = result.replaceAll(","," "); 
			}
		String resource = "<h1> Here is the string Formate of number "+result+" </h1>";
		return resource;
		
	}

}
