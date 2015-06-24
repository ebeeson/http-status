package restly.exceptions.clienterror;

import restly.*;

/**
 * 404 Not Found
 * <p/>
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