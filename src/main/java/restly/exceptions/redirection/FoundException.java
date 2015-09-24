package restly.exceptions.redirection;

import restly.HttpStatus;

/**
 * 302 Found
 * <p/>
 * <p>
 * The requested resource resides temporarily under a different URI.
 * Since the redirection might be altered on occasion, the client SHOULD
 * continue to use the Request-URI for future requests. This response
 * is only cacheable if indicated by a Cache-Control or Expires header
 * field.
 * </p>
 * <p>
 * The temporary URI SHOULD be given by the Location field in the
 * response. Unless the request method was HEAD, the entity of the
 * response SHOULD contain a short hypertext note with a hyperlink to
 * the new URI(s).
 * </p>
 * <p>
 * If the 302 status code is received in response to a request other
 * than GET or HEAD, the user agent MUST NOT automatically redirect the
 * request unless it can be confirmed by the user, since this might
 * change the conditions under which the request was issued.
 * </p>
 * <pre>      Note: RFC 1945 and RFC 2068 specify that the client is not allowed
 *   to change the method on the redirected request.  However, most
 *   existing user agent implementations treat 302 as if it were a 303
 *   response, performing a GET on the Location field-value regardless
 *   of the original request method. The status codes 303 and 307 have
 *   been added for servers that wish to make unambiguously clear which
 *   kind of reaction is expected of the client.
 * </pre>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class FoundException extends HttpRedirectionException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.FOUND;

	public FoundException(String url) {
		super(HTTP_STATUS, url);
	}
}