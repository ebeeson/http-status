package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 401 Unauthorized
 * <p/>
 * <p>
 * <p/>
 * The request requires user authentication. The response MUST include a
 * WWW-Authenticate header field (section 14.47) containing a challenge
 * applicable to the requested resource. The client MAY repeat the
 * request with a suitable Authorization header field (section
 * <a rel='xref' href='http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.8'>14.8</a>
 * ). If
 * the request already included Authorization credentials, then the 401
 * response indicates that authorization has been refused for those
 * credentials. If the 401 response contains the same challenge as the
 * prior response, and the user agent has already attempted
 * authentication at least once, then the user SHOULD be presented the
 * entity that was given in the response, since that entity might
 * include relevant diagnostic information. HTTP access authentication
 * is explained in &quot;HTTP Authentication: Basic and Digest Access
 * Authentication&quot;
 * <a rel='bibref' href='http://www.w3.org/Protocols/rfc2616/rfc2616-sec17.html#bib43'>[43]</a>
 * .
 * <p/>
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.2">https://tools.ietf.org/html/rfc2616#section-10.4.2</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class UnauthorizedException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.UNAUTHORIZED;

	public UnauthorizedException() {
		this(null);
	}

	public UnauthorizedException(Object data) {
		super(HTTP_STATUS, data);
	}
}