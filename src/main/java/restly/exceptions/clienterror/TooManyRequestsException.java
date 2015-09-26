package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 429 Too Many Requests
 * <p/>
 * <p>
 * The 429 status code indicates that the user has sent too many
 * requests in a given amount of time (&quot;rate limiting&quot;).
 * </p>
 * <p>
 * The response representations SHOULD include details explaining the
 * condition, and MAY include a Retry-After header indicating how long
 * to wait before making a new request.
 * </p>
 * <p>
 * Note that this specification does not define how the origin server
 * identifies the user, nor how it counts requests.  For example, an
 * origin server that is limiting request rates can do so based upon
 * counts of requests on a per-resource basis, across the entire server,
 * or even among a set of servers.  Likewise, it might identify the user
 * by its authentication credentials, or a stateful cookie.
 * </p>
 * <p>
 * Responses with the 429 status code MUST NOT be stored by a cache.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc6585#section-4">https://tools.ietf.org/html/rfc6585#section-4</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class TooManyRequestsException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.TOO_MANY_REQUESTS;

	public TooManyRequestsException() {
		this(null);
	}

	public TooManyRequestsException(Object data) {
		super(HTTP_STATUS, data);
	}
}