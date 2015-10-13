package restly.exceptions.successful;

import restly.HttpStatus;

/**
 * 200 OK
 *
 * <p>
 * The request has succeeded. The information returned with the response
 * is dependent on the method used in the request, for example:
 * </p>
 * <p>
 * GET an entity corresponding to the requested resource is sent in
 * the response;
 * </p>
 * <p>
 * HEAD the entity-header fields corresponding to the requested
 * resource are sent in the response without any message-body;
 * </p>
 * <p>
 * POST an entity describing or containing the result of the action;
 * </p>
 * <p>
 * TRACE an entity containing the request message as received by the
 * end server.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.2.1">https://tools.ietf.org/html/rfc2616#section-10.2.1</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class OKException extends HttpSuccessfulException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.OK;

	public OKException() {
		this(null);
	}

	public OKException(Object data) {
		super(HTTP_STATUS, data);
	}
}