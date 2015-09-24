package restly.exceptions.redirection;

import restly.HttpStatus;

/**
 * 301 Moved Permanently
 * <p/>
 * <p>
 * The requested resource has been assigned a new permanent URI and any
 * future references to this resource SHOULD use one of the returned
 * URIs. Clients with link editing capabilities ought to automatically
 * re-link references to the Request-URI to one or more of the new
 * references returned by the server, where possible. This response is
 * cacheable unless indicated otherwise.
 * </p>
 * <p>
 * The new permanent URI SHOULD be given by the Location field in the
 * response. Unless the request method was HEAD, the entity of the
 * response SHOULD contain a short hypertext note with a hyperlink to
 * the new URI(s).
 * </p>
 * <p>
 * If the 301 status code is received in response to a request other
 * than GET or HEAD, the user agent MUST NOT automatically redirect the
 * request unless it can be confirmed by the user, since this might
 * change the conditions under which the request was issued.
 * </p>
 * <pre>      Note: When automatically redirecting a POST request after
 *   receiving a 301 status code, some existing HTTP/1.0 user agents
 *   will erroneously change it into a GET request.
 * </pre>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class MovedPermanentlyException extends HttpRedirectionException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.MOVED_PERMANENTLY;

	public MovedPermanentlyException(String url) {
		super(HTTP_STATUS, url);
	}
}