package restly.exceptions.clienterror;

import restly.*;

/**
 * 431 Request Header Fields Too Large
 * <p/>
 * <p>
 * The 431 status code indicates that the server is unwilling to process
 * the request because its header fields are too large.  The request MAY
 * be resubmitted after reducing the size of the request header fields.
 * </p>
 * <p>
 * It can be used both when the set of request header fields in total is
 * too large, and when a single header field is at fault.  In the latter
 * case, the response representation SHOULD specify which header field
 * was too large.
 * </p>
 * <p>
 * Responses with the 431 status code MUST NOT be stored by a cache.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class RequestHeaderFieldsTooLargeException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE;

	public RequestHeaderFieldsTooLargeException() {
		this(null);
	}

	public RequestHeaderFieldsTooLargeException(Object data) {
		super(HTTP_STATUS, data);
	}
}