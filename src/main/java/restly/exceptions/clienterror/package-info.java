/**
 * 4xx Client Error
 *
 * <p>
 * The 4xx class of status code is intended for cases in which the
 * client seems to have erred. Except when responding to a HEAD request,
 * the server SHOULD include an entity containing an explanation of the
 * error situation, and whether it is a temporary or permanent
 * condition. These status codes are applicable to any request method.
 * User agents SHOULD display any included entity to the user.
 * </p>
 * <p>
 * If the client is sending data, a server implementation using TCP
 * SHOULD be careful to ensure that the client acknowledges receipt of
 * the packet(s) containing the response, before the server closes the
 * input connection. If the client continues sending data to the server
 * after the close, the server's TCP stack will send a reset packet to
 * the client, which may erase the client's unacknowledged input buffers
 * before they can be read and interpreted by the HTTP application.
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4">http://tools.ietf.org/html/rfc2616#section-10.4</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
package restly.exceptions.clienterror;
