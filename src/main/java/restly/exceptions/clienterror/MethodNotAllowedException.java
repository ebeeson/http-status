package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 405 Method Not Allowed
 * <p/>
 * <p>
 * The method specified in the Request-Line is not allowed for the
 * resource identified by the Request-URI. The response MUST include an
 * Allow header containing a list of valid methods for the requested
 * resource.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class MethodNotAllowedException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.METHOD_NOT_ALLOWED;

	public MethodNotAllowedException() {
		this(null);
	}

	public MethodNotAllowedException(Object data) {
		super(HTTP_STATUS, data);
	}
}