package restly.exceptions.clienterror;

import restly.*;

/**
 * 413 Request Entity Too Large
 * <p/>
 * <p>
 * The server is refusing to process a request because the request
 * entity is larger than the server is willing or able to process. The
 * server MAY close the connection to prevent the client from continuing
 * the request.
 * </p>
 * <p>
 * If the condition is temporary, the server SHOULD include a Retry-
 * After header field to indicate that it is temporary and after what
 * time the client MAY try again.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class RequestEntityTooLargeException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.REQUEST_ENTITY_TOO_LARGE;

	public RequestEntityTooLargeException() {
		this(null);
	}

	public RequestEntityTooLargeException(Object data) {
		super(HTTP_STATUS, data);
	}
}