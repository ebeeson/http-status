package restly.exceptions.redirection;

import restly.*;
import restly.exceptions.*;

/**
 * Feb 24, 2009 5:42:38 AM
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class HttpRedirectionException extends HttpStatusException {
	private final String url;

	public HttpRedirectionException(HttpStatus status, String url) {
		super(status);
		this.url = url;
	}

	/*
	 public void represent(RestlyContext context, RestlyHttpServletRequest request, RestlyHttpServletResponse response) throws IOException {
		 response.setStatus(getStatus());
		 response.setHeader("Location", url);
		 if(MediaType.JSON.equals(request.getPreferredMediaType())) {
			 response.setMediaType(MediaType.JSON);
			 response.getWriter().println("{'url':'" + url + "'}");
		 } else if(MediaType.TEXT_XML.equals(request.getPreferredMediaType())) {
			 response.setMediaType(MediaType.TEXT_XML);
			 response.getWriter().println("<url>" + url + "</url>");
		 } else if(MediaType.TEXT_HTML.equals(request.getPreferredMediaType())) {
			 response.setMediaType(MediaType.TEXT_HTML);
			 response.getWriter().println("<a href=\"" + url + "\">" + url + "</a>");
		 } else {
			 response.setMediaType(MediaType.TEXT_PLAIN);
			 response.getWriter().println(url);
		 }
	 }
 */
	public String getUrl() {
		return url;
	}
}