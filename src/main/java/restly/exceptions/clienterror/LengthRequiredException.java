package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 411 Length Required
 * <p/>
 * <p>
 * The server refuses to accept the request without a defined Content-
 * Length. The client MAY repeat the request if it adds a valid
 * Content-Length header field containing the length of the message-body
 * in the request message.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class LengthRequiredException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.LENGTH_REQUIRED;

	public LengthRequiredException() {
		this(null);
	}

	public LengthRequiredException(Object data) {
		super(HTTP_STATUS, data);
	}
}