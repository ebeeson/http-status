package restly.exceptions.clienterror;

import restly.*;

/**
 * 451 Unavailable For Legal Reasons
 *
 * <p>
 * This status code indicates that the server is denying access to the
 * resource as a consequence of a legal demand.
 * </p>
 * <p>
 * The server in question may not be an origin server.  This type of
 * legal demand typically most directly affects the operations of ISPs
 * and search engines.
 * </p>
 * <p>
 * Responses using this status code SHOULD include an explanation, in
 * the response body, of the details of the legal demand: the party
 * making it, the applicable legislation or regulation, and what classes
 * of person and resource it applies to.
 * </p>
 * <p>
 * The use of the 451 status code implies neither the existence nor non-
 * existence of the resource named in the request.  That is to say, it
 * is possible that if the legal demands were removed, a request for the
 * resource still might not succeed.
 * </p>
 * <p>
 * Note that in many cases clients can still access the denied resource
 * by using technical countermeasures such as a VPN or the Tor network.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/draft-tbray-http-legally-restricted-status-05">https://tools.ietf.org/html/draft-tbray-http-legally-restricted-status-05</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class UnavailableForLegalReasonsException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS;

	public UnavailableForLegalReasonsException() {
		this(null);
	}

	public UnavailableForLegalReasonsException(Object data) {
		super(HTTP_STATUS, data);
	}
}
