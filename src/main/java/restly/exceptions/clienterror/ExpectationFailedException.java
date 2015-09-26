package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 417 Expectation Failed
 * <p/>
 * <p>
 * The expectation given in an Expect request-header field (see section
 * 14.20) could not be met by this server, or, if the server is a proxy,
 * the server has unambiguous evidence that the request could not be met
 * by the next-hop server.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.18">https://tools.ietf.org/html/rfc2616#section-10.4.18</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class ExpectationFailedException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.EXPECTATION_FAILED;

	public ExpectationFailedException() {
		this(null);
	}

	public ExpectationFailedException(Object data) {
		super(HTTP_STATUS, data);
	}
}