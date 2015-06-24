package restly.exceptions.clienterror;

import restly.*;

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