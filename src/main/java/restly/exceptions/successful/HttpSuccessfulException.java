package restly.exceptions.successful;

import restly.HttpStatus;
import restly.exceptions.HttpStatusException;

/**
 * 2xx Successful
 *
 * <p>
 * This class of status code indicates that the client's request was
 * successfully received, understood, and accepted.
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.2">http://tools.ietf.org/html/rfc2616#section-10.2</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class HttpSuccessfulException extends HttpStatusException {
	public HttpSuccessfulException(HttpStatus status) {
		super(status);
	}

	public HttpSuccessfulException(HttpStatus status, Object data) {
		super(status, data);
	}
}
