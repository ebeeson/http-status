package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 412 Precondition Failed
 *
 * <p>
 * The precondition given in one or more of the request-header fields
 * evaluated to false when it was tested on the server. This response
 * code allows the client to place preconditions on the current resource
 * metainformation (header field data) and thus prevent the requested
 * method from being applied to a resource other than the one intended.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.13">https://tools.ietf.org/html/rfc2616#section-10.4.13</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class PreconditionFailedException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.PRECONDITION_FAILED;

	public PreconditionFailedException() {
		this(null);
	}

	public PreconditionFailedException(Object data) {
		super(HTTP_STATUS, data);
	}
}