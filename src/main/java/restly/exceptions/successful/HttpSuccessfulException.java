package restly.exceptions.successful;

import restly.HttpStatus;
import restly.exceptions.HttpStatusException;

/**
 * 2xx Successful
 * <p/>
 * <p>
 * This class of status code indicates that the client&apos;s request was
 * successfully received, understood, and accepted.
 * </p>
 *
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
