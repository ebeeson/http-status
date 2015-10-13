package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 414 Request-URI Too Long
 *
 * <p>
 * The server is refusing to service the request because the Request-URI
 * is longer than the server is willing to interpret. This rare
 * condition is only likely to occur when a client has improperly
 * converted a POST request to a GET request with long query
 * information, when the client has descended into a URI &quot;black hole&quot; of
 * redirection (e.g., a redirected URI prefix that points to a suffix of
 * itself), or when the server is under attack by a client attempting to
 * exploit security holes present in some servers using fixed-length
 * buffers for reading or manipulating the Request-URI.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.15">https://tools.ietf.org/html/rfc2616#section-10.4.15</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class RequestURITooLongException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.REQUEST_URI_TOO_LONG;

	public RequestURITooLongException() {
		this(null);
	}

	public RequestURITooLongException(Object data) {
		super(HTTP_STATUS, data);
	}
}