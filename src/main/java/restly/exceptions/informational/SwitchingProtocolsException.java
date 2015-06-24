package restly.exceptions.informational;

import restly.*;

/**
 * 101 Switching Protocols
 * <p/>
 * <p>
 * The server understands and is willing to comply with the client&apos;s
 * request, via the Upgrade message header field (section 14.42), for a
 * change in the application protocol being used on this connection. The
 * server will switch protocols to those defined by the response&apos;s
 * Upgrade header field immediately after the empty line which
 * terminates the 101 response.
 * </p>
 * <p>
 * The protocol SHOULD be switched only when it is advantageous to do
 * so. For example, switching to a newer version of HTTP is advantageous
 * over older versions, and switching to a real-time, synchronous
 * protocol might be advantageous when delivering resources that use
 * such features.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class SwitchingProtocolsException extends HttpInformationalException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.SWITCHING_PROTOCOLS;

	public SwitchingProtocolsException() {
		this(null);
	}

	public SwitchingProtocolsException(Object data) {
		super(HTTP_STATUS, data);
	}
}