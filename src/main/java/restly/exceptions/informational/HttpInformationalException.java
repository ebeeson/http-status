package restly.exceptions.informational;

import restly.HttpStatus;
import restly.exceptions.HttpStatusException;

/**
 * 1xx Informational
 * <p/>
 * <p>
 * This class of status code indicates a provisional response,
 * consisting only of the Status-Line and optional headers, and is
 * terminated by an empty line. There are no required headers for this
 * class of status code. Since HTTP/1.0 did not define any 1xx status
 * codes, servers MUST NOT send a 1xx response to an HTTP/1.0 client
 * except under experimental conditions.
 * </p>
 * <p>
 * A client MUST be prepared to accept one or more 1xx status responses
 * prior to a regular response, even if the client does not expect a 100
 * (Continue) status message. Unexpected 1xx status responses MAY be
 * ignored by a user agent.
 * </p>
 * <p>
 * Proxies MUST forward 1xx responses, unless the connection between the
 * proxy and its client has been closed, or unless the proxy itself
 * requested the generation of the 1xx response. (For example, if a
 * proxy adds a &quot;Expect: 100-continue&quot; field when it forwards a request,
 * then it need not forward the corresponding 100 (Continue)
 * response(s).)
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class HttpInformationalException extends HttpStatusException {
	public HttpInformationalException(HttpStatus status) {
		super(status);
	}

	public HttpInformationalException(HttpStatus status, Object data) {
		super(status, data);
	}
}
