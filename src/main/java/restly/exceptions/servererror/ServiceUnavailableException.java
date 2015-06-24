package restly.exceptions.servererror;

import restly.*;

/**
 * 503 Service Unavailable
 * <p/>
 * <p>
 * The server is currently unable to handle the request due to a
 * temporary overloading or maintenance of the server. The implication
 * is that this is a temporary condition which will be alleviated after
 * some delay. If known, the length of the delay MAY be indicated in a
 * Retry-After header. If no Retry-After is given, the client SHOULD
 * handle the response as it would for a 500 response.
 * </p>
 * <pre>      Note: The existence of the 503 status code does not imply that a
 *   server must use it when becoming overloaded. Some servers may wish
 *   to simply refuse the connection.
 * </pre>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class ServiceUnavailableException extends HttpServerErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.SERVICE_UNAVAILABLE;

	public ServiceUnavailableException() {
		this(null);
	}

	public ServiceUnavailableException(Object data) {
		super(HTTP_STATUS, data);
	}
}