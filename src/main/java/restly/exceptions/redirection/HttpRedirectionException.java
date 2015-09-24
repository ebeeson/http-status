package restly.exceptions.redirection;

import restly.HttpStatus;
import restly.exceptions.HttpStatusException;

/**
 * 3xx Redirection
 * <p/>
 * <p>
 * This class of status code indicates that further action needs to be
 * taken by the user agent in order to fulfill the request.  The action
 * required MAY be carried out by the user agent without interaction
 * with the user if and only if the method used in the second request is
 * GET or HEAD. A client SHOULD detect infinite redirection loops, since
 * such loops generate network traffic for each redirection.
 * </p>
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