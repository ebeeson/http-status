package restly.exceptions.successful;

import restly.HttpStatus;

/**
 * 205 Reset Content
 *
 * <p>
 * The server has fulfilled the request and the user agent SHOULD reset
 * the document view which caused the request to be sent. This response
 * is primarily intended to allow input for actions to take place via
 * user input, followed by a clearing of the form in which the input is
 * given so that the user can easily initiate another input action. The
 * response MUST NOT include an entity.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.2.6">https://tools.ietf.org/html/rfc2616#section-10.2.6</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class ResetContentException extends HttpSuccessfulException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.RESET_CONTENT;

	public ResetContentException() {
		this(null);
	}

	public ResetContentException(Object data) {
		super(HTTP_STATUS, data);
	}
}