package restly.exceptions.clienterror;

import restly.*;
import restly.exceptions.*;

/**
 * Apr 10, 2009 5:54:54 AM
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class HttpClientErrorException extends HttpStatusException {
	public HttpClientErrorException(HttpStatus status) {
		super(status);
	}

	public HttpClientErrorException(HttpStatus status, Object data) {
		super(status, data);
	}
}
