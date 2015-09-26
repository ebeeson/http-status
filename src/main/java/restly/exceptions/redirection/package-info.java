/**
 * 3xx Redirection
 * <p/>
 * <p>
 * This class of status code indicates that further action needs to be
 * taken by the user agent in order to fulfill the request.  The action
 * required MAY be carried out by the user agent without interaction
 * with the user if and only if the method used in the second request is
 * GET or HEAD. A client SHOULD detect infinite redirection loops, since
 * such loops generate network traffic for each redirection.
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.3">http://tools.ietf.org/html/rfc2616#section-10.3</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
package restly.exceptions.redirection;
