package restly.exceptions.servererror;

import restly.HttpStatus;

/**
 * 502 Bad Gateway
 * <p/>
 * <p>
 * The server, while acting as a gateway or proxy, received an invalid
 * response from the upstream server it accessed in attempting to
 * fulfill the request.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.5.3">https://tools.ietf.org/html/rfc2616#section-10.5.3</a>
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