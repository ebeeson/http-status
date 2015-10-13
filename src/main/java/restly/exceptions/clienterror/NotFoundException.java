package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 404 Not Found
 *
 * <p>
 * The server has not found anything matching the Request-URI. No
 * indication is given of whether the condition is temporary or
 * permanent. The 410 (Gone) status code SHOULD be used if the server
 * knows, through some internally configurable mechanism, that an old
 * resource is permanently unavailable and has no forwarding address.
 * This status code is commonly used when the server does not wish to
 * reveal exactly why the request has been refused, or when no other
 * response is applicable.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.5">https://tools.ietf.org/html/rfc2616#section-10.4.5</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class NotFoundException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.NOT_FOUND;

	public NotFoundException() {
		this(null);
	}

	public NotFoundException(Object data) {
		super(HTTP_STATUS, data);
	}
}