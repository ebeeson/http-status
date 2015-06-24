package restly.exceptions.clienterror;

import restly.*;

/**
 * 407 Proxy Authentication Required
 * <p/>
 * <p>
 * <p/>
 * This code is similar to 401 (Unauthorized), but indicates that the
 * client must first authenticate itself with the proxy. The proxy MUST
 * return a Proxy-Authenticate header field (section
 * <a rel='xref' href='http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.33'>14.33</a>
 * )
 * containing a
 * challenge applicable to the proxy for the requested resource. The
 * client MAY repeat the request with a suitable Proxy-Authorization
 * header field (section
 * <a rel='xref' href='http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.34'>14.34</a>
 * ). HTTP access authentication is
 * explained
 * in &quot;HTTP Authentication: Basic and Digest Access Authentication&quot;
 * <p/>
 * <a rel='bibref' href='http://www.w3.org/Protocols/rfc2616/rfc2616-sec17.html#bib43'>[43]</a>
 * .
 * <p/>
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class ProxyAuthenticationRequiredException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.PROXY_AUTHENTICATION_REQUIRED;

	public ProxyAuthenticationRequiredException() {
		this(null);
	}

	public ProxyAuthenticationRequiredException(Object data) {
		super(HTTP_STATUS, data);
	}
}