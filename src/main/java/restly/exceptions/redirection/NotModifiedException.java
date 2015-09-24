package restly.exceptions.redirection;

import restly.HttpStatus;

/**
 * 304 Not Modified
 * <p/>
 * <p>
 * If the client has performed a conditional GET request and access is
 * allowed, but the document has not been modified, the server SHOULD
 * respond with this status code. The 304 response MUST NOT contain a
 * message-body, and thus is always terminated by the first empty line
 * after the header fields.
 * </p>
 * <p>
 * The response MUST include the following header fields:
 * </p>
 * <pre>      - Date, unless its omission is required by section 14.18.1
 * </pre>
 * <p>
 * <p/>
 * If a clockless origin server obeys these rules, and proxies and
 * clients add their own Date to any response received without one (as
 * already specified by [RFC 2068], section
 * <a rel='xref' href='http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.19'>14.19</a>
 * ), caches
 * will operate
 * correctly.
 * <p/>
 * </p>
 * <pre>      - ETag and/or Content-Location, if the header would have been sent
 * 	in a 200 response to the same request
 * </pre>
 * <pre>      - Expires, Cache-Control, and/or Vary, if the field-value might
 * 	differ from that sent in any previous response for the same
 * 	variant
 * </pre>
 * <p>
 * If the conditional GET used a strong cache validator (see section
 * 13.3.3), the response SHOULD NOT include other entity-headers.
 * Otherwise (i.e., the conditional GET used a weak validator), the
 * response MUST NOT include other entity-headers; this prevents
 * inconsistencies between cached entity-bodies and updated headers.
 * </p>
 * <p>
 * If a 304 response indicates an entity not currently cached, then the
 * cache MUST disregard the response and repeat the request without the
 * conditional.
 * </p>
 * <p>
 * If a cache uses a received 304 response to update a cache entry, the
 * cache MUST update the entry to reflect any new field values given in
 * the response.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class NotModifiedException extends HttpRedirectionException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.NOT_MODIFIED;

	public NotModifiedException(String url) {
		super(HTTP_STATUS, url);
	}
}