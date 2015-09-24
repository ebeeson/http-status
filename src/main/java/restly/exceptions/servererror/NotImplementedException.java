package restly.exceptions.servererror;

import restly.HttpStatus;

/**
 * 501 Not Implemented
 * <p/>
 * <p>
 * The server does not support the functionality required to fulfill the
 * request. This is the appropriate response when the server does not
 * recognize the request method and is not capable of supporting it for
 * any resource.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class NotImplementedException extends HttpServerErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.NOT_IMPLEMENTED;

	public NotImplementedException() {
		this(null);
	}

	public NotImplementedException(Object data) {
		super(HTTP_STATUS, data);
	}
}