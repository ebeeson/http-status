package restly.exceptions.successful;

import restly.*;
import restly.exceptions.*;

/**
 * Apr 10, 2009 6:02:09 AM
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
