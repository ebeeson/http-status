package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 406 Not Acceptable
 * <p/>
 * <p>
 * The resource identified by the request is only capable of generating
 * response entities which have content characteristics not acceptable
 * according to the accept headers sent in the request.
 * </p>
 * <p>
 * Unless it was a HEAD request, the response SHOULD include an entity
 * containing a list of available entity characteristics and location(s)
 * from which the user or user agent can choose the one most
 * appropriate. The entity format is specified by the media type given
 * in the Content-Type header field. Depending upon the format and the
 * capabilities of the user agent, selection of the most appropriate
 * choice MAY be performed automatically. However, this specification
 * does not define any standard for such automatic selection.
 * </p>
 * <pre>      Note: HTTP/1.1 servers are allowed to return responses which are
 *   not acceptable according to the accept headers sent in the
 *   request. In some cases, this may even be preferable to sending a
 *   406 response. User agents are encouraged to inspect the headers of
 *   an incoming response to determine if it is acceptable.
 * </pre>
 * <p>
 * If the response could be unacceptable, a user agent SHOULD
 * temporarily stop receipt of more data and query the user for a
 * decision on further actions.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.7">https://tools.ietf.org/html/rfc2616#section-10.4.7</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class NotAcceptableException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.NOT_ACCEPTABLE;

	public NotAcceptableException() {
		this(null);
	}

	public NotAcceptableException(Object data) {
		super(HTTP_STATUS, data);
	}
}