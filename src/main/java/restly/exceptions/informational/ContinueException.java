package restly.exceptions.informational;

import restly.HttpStatus;

/**
 * 100 Continue
 * <p/>
 * <p>
 * <p/>
 * The client SHOULD continue with its request. This interim response is
 * used to inform the client that the initial part of the request has
 * been received and has not yet been rejected by the server. The client
 * SHOULD continue by sending the remainder of the request or, if the
 * request has already been completed, ignore this response. The server
 * MUST send a final response after the request has been completed. See
 * section
 * <a rel='xref' href='http://www.w3.org/Protocols/rfc2616/rfc2616-sec8.html#sec8.2.3'>8.2.3</a>
 * for detailed discussion of the use and
 * handling of this
 * status code.
 * <p/>
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.1.1">https://tools.ietf.org/html/rfc2616#section-10.1.1</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class ContinueException extends HttpInformationalException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.CONTINUE;

	public ContinueException() {
		this(null);
	}

	public ContinueException(Object data) {
		super(HTTP_STATUS, data);
	}
}