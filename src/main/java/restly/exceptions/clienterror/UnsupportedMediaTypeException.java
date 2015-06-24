package restly.exceptions.clienterror;

import restly.*;

/**
 * 415 Unsupported Media Type
 * <p/>
 * <p>
 * The server is refusing to service the request because the entity of
 * the request is in a format not supported by the requested resource
 * for the requested method.
 * </p>
 *
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