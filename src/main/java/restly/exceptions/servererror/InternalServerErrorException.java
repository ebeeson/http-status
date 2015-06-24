package restly.exceptions.servererror;

import restly.*;

/**
 * 500 Internal Server Error
 * <p/>
 * <p>
 * The server encountered an unexpected condition which prevented it
 * from fulfilling the request.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class InternalServerErrorException extends HttpServerErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;

	public InternalServerErrorException() {
		this(null);
	}

	public InternalServerErrorException(Object data) {
		super(HTTP_STATUS, data);
	}
}