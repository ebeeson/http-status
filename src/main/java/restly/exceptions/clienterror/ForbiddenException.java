package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 403 Forbidden
 * <p/>
 * <p>
 * The server understood the request, but is refusing to fulfill it.
 * Authorization will not help and the request SHOULD NOT be repeated.
 * If the request method was not HEAD and the server wishes to make
 * public why the request has not been fulfilled, it SHOULD describe the
 * reason for the refusal in the entity. If the server does not wish to
 * make this information available to the client, the status code 404
 * (Not Found) can be used instead.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.4">https://tools.ietf.org/html/rfc2616#section-10.4.4</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class ForbiddenException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.FORBIDDEN;

	public ForbiddenException() {
		this(null);
	}

	public ForbiddenException(Object data) {
		super(HTTP_STATUS, data);
	}
}