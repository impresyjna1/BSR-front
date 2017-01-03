
package bsr.server.innerservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bsr.server.innerservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserResponse_QNAME = new QName("http://innerServices.server.bsr/", "getUserResponse");
    private final static QName _NotValidException_QNAME = new QName("http://innerServices.server.bsr/", "NotValidException");
    private final static QName _ServerException_QNAME = new QName("http://innerServices.server.bsr/", "ServerException");
    private final static QName _LoginResponse_QNAME = new QName("http://innerServices.server.bsr/", "loginResponse");
    private final static QName _GetUser_QNAME = new QName("http://innerServices.server.bsr/", "getUser");
    private final static QName _AuthException_QNAME = new QName("http://innerServices.server.bsr/", "AuthException");
    private final static QName _Login_QNAME = new QName("http://innerServices.server.bsr/", "login");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bsr.server.innerservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link NotValidException }
     * 
     */
    public NotValidException createNotValidException() {
        return new NotValidException();
    }

    /**
     * Create an instance of {@link ServerException }
     * 
     */
    public ServerException createServerException() {
        return new ServerException();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link AuthException }
     * 
     */
    public AuthException createAuthException() {
        return new AuthException();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotValidException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "NotValidException")
    public JAXBElement<NotValidException> createNotValidException(NotValidException value) {
        return new JAXBElement<NotValidException>(_NotValidException_QNAME, NotValidException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "ServerException")
    public JAXBElement<ServerException> createServerException(ServerException value) {
        return new JAXBElement<ServerException>(_ServerException_QNAME, ServerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "AuthException")
    public JAXBElement<AuthException> createAuthException(AuthException value) {
        return new JAXBElement<AuthException>(_AuthException_QNAME, AuthException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

}
