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
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.1">https://tools.ietf.org/html/rfc2616#section-10.4.1</a>
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