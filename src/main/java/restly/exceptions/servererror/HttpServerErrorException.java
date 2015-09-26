package restly.exceptions.servererror;

import restly.HttpStatus;
import restly.exceptions.HttpStatusException;

/**
 * 5xx Server Error
 * <p/>
 * <p>
 * Response status codes beginning with the digit &quot;5&quot; indicate cases in
 * which the server is aware that it has erred or is incapable of
 * performing the request. Except when responding to a HEAD request, the
 * server SHOULD include an entity containing an explanation of the
 * error situation, and whether it is a temporary or permanent
 * condition. User agents SHOULD display any included entity to the
 * user. These response codes are applicable to any request method.
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.5">http://tools.ietf.org/html/rfc2616#section-10.5</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class HttpServerErrorException extends HttpStatusException {
	public HttpServerErrorException(HttpStatus status) {
		super(status);
	}

	public HttpServerErrorException(HttpStatus status, Object data) {
		super(status, data);
	}
}
