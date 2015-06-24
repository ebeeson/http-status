package restly.exceptions.successful;

import restly.*;

/**
 * 204 No Content
 * <p/>
 * <p>
 * The server has fulfilled the request but does not need to return an
 * entity-body, and might want to return updated metainformation. The
 * response MAY include new or updated metainformation in the form of
 * entity-headers, which if present SHOULD be associated with the
 * requested variant.
 * </p>
 * <p>
 * If the client is a user agent, it SHOULD NOT change its document view
 * from that which caused the request to be sent. This response is
 * primarily intended to allow input for actions to take place without
 * causing a change to the user agent&apos;s active document view, although
 * any new or updated metainformation SHOULD be applied to the document
 * currently in the user agent&apos;s active view.
 * </p>
 * <p>
 * The 204 response MUST NOT include a message-body, and thus is always
 * terminated by the first empty line after the header fields.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class NoContentException extends HttpSuccessfulException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.NO_CONTENT;

	public NoContentException() {
		this(null);
	}

	public NoContentException(Object data) {
		super(HTTP_STATUS, data);
	}
}