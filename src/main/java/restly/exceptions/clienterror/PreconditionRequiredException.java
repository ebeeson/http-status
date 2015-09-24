package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 428 Precondition Required
 * <p/>
 * <p>
 * The 428 status code indicates that the origin server requires the
 * request to be conditional.
 * </p>
 * <p>
 * Its typical use is to avoid the "lost update" problem, where a client
 * GETs a resource's state, modifies it, and PUTs it back to the server,
 * when meanwhile a third party has modified the state on the server,
 * leading to a conflict.  By requiring requests to be conditional, the
 * server can assure that clients are working with the correct copies.
 * </p>
 * <p>
 * Responses using this status code SHOULD explain how to resubmit the
 * request successfully.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class PreconditionRequiredException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.PRECONDITION_REQUIRED;

	public PreconditionRequiredException() {
		this(null);
	}

	public PreconditionRequiredException(Object data) {
		super(HTTP_STATUS, data);
	}
}