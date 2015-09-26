package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 402 Payment Required
 * <p/>
 * <p>
 * This code is reserved for future use.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.3">https://tools.ietf.org/html/rfc2616#section-10.4.3</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class PaymentRequiredException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.PAYMENT_REQUIRED;

	public PaymentRequiredException() {
		this(null);
	}

	public PaymentRequiredException(Object data) {
		super(HTTP_STATUS, data);
	}
}