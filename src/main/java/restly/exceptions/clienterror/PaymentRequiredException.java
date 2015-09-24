package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 402 Payment Required
 * <p/>
 * <p>
 * This code is reserved for future use.
 * </p>
 *
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