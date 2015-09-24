package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 400 Bad Request
 * <p/>
 * <p>
 * The request could not be understood by the server due to malformed
 * syntax. The client SHOULD NOT repeat the request without
 * modifications.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class BadRequestException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.BAD_REQUEST;

	public BadRequestException() {
		this(null);
	}

	public BadRequestException(Object data) {
		super(HTTP_STATUS, data);
	}
}