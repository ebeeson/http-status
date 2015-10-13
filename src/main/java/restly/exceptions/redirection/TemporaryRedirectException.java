package restly.exceptions.redirection;

import restly.HttpStatus;

/**
 * 307 Temporary Redirect
 *
 * <p>
 * The requested resource resides temporarily under a different URI.
 * Since the redirection MAY be altered on occasion, the client SHOULD
 * continue to use the Request-URI for future requests. This response
 * is only cacheable if indicated by a Cache-Control or Expires header
 * field.
 * </p>
 * <p>
 * The temporary URI SHOULD be given by the Location field in the
 * response. Unless the request method was HEAD, the entity of the
 * response SHOULD contain a short hypertext note with a hyperlink to
 * the new URI(s) , since many pre-HTTP/1.1 user agents do not
 * understand the 307 status. Therefore, the note SHOULD contain the
 * information necessary for a user to repeat the original request on
 * the new URI.
 * </p>
 * <p>
 * If the 307 status code is received in response to a request other
 * than GET or HEAD, the user agent MUST NOT automatically redirect the
 * request unless it can be confirmed by the user, since this might
 * change the conditions under which the request was issued.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.3.8">https://tools.ietf.org/html/rfc2616#section-10.3.8</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class TemporaryRedirectException extends HttpRedirectionException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.TEMPORARY_REDIRECT;

	public TemporaryRedirectException(String url) {
		super(HTTP_STATUS, url);
	}
}