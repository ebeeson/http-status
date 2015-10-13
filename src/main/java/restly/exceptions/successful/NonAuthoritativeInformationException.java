package restly.exceptions.successful;

import restly.HttpStatus;

/**
 * 203 Non-Authoritative Information
 *
 * <p>
 * The returned metainformation in the entity-header is not the
 * definitive set as available from the origin server, but is gathered
 * from a local or a third-party copy. The set presented MAY be a subset
 * or superset of the original version. For example, including local
 * annotation information about the resource might result in a superset
 * of the metainformation known by the origin server. Use of this
 * response code is not required and is only appropriate when the
 * response would otherwise be 200 (OK).
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.2.4">https://tools.ietf.org/html/rfc2616#section-10.2.4</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class NonAuthoritativeInformationException extends HttpSuccessfulException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.NON_AUTHORITATIVE_INFORMATION;

	public NonAuthoritativeInformationException() {
		this(null);
	}

	public NonAuthoritativeInformationException(Object data) {
		super(HTTP_STATUS, data);
	}
}