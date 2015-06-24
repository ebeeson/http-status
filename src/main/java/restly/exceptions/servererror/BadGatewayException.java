package restly.exceptions.servererror;

import restly.*;

/**
 * 502 Bad Gateway
 * <p/>
 * <p>
 * The server, while acting as a gateway or proxy, received an invalid
 * response from the upstream server it accessed in attempting to
 * fulfill the request.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class BadGatewayException extends HttpServerErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.BAD_GATEWAY;

	public BadGatewayException() {
		this(null);
	}

	public BadGatewayException(Object data) {
		super(HTTP_STATUS, data);
	}
}