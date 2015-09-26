package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 415 Unsupported Media Type
 * <p/>
 * <p>
 * The server is refusing to service the request because the entity of
 * the request is in a format not supported by the requested resource
 * for the requested method.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.16">https://tools.ietf.org/html/rfc2616#section-10.4.16</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class UnsupportedMediaTypeException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.UNSUPPORTED_MEDIA_TYPE;

	public UnsupportedMediaTypeException() {
		this(null);
	}

	public UnsupportedMediaTypeException(Object data) {
		super(HTTP_STATUS, data);
	}
}