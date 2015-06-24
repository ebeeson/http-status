package restly.exceptions.servererror;

import restly.*;
import restly.exceptions.*;

/**
 * Apr 10, 2009 6:01:26 AM
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class HttpServerErrorException extends HttpStatusException {
	public HttpServerErrorException(HttpStatus status) {
		super(status);
	}

	public HttpServerErrorException(HttpStatus status, Object data) {
		super(status, data);
	}
}
