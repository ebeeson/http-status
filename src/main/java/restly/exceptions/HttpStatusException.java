package restly.exceptions;

import restly.HttpStatus;

/**
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class HttpStatusException extends Exception {
	private final HttpStatus status;
	private final Object data;

	public HttpStatusException(HttpStatus status) {
		this(status, null);
	}

	public HttpStatusException(HttpStatus status, Object data) {
		super(status.toString());
		this.status = status;
		this.data = data;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public Object getData() {
		return data;
	}
}