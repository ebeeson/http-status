package restly.exceptions.servererror;

import restly.HttpStatus;

/**
 * 500 Internal Server Error
 * <p/>
 * <p>
 * The server encountered an unexpected condition which prevented it
 * from fulfilling the request.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.5.1">https://tools.ietf.org/html/rfc2616#section-10.5.1</a>
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