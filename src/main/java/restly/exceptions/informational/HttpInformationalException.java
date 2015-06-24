package restly.exceptions.informational;

import restly.*;
import restly.exceptions.*;

/**
 * Apr 10, 2009 5:56:06 AM
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class HttpInformationalException extends HttpStatusException {
	public HttpInformationalException(HttpStatus status) {
		super(status);
	}

	public HttpInformationalException(HttpStatus status, Object data) {
		super(status, data);
	}
}
