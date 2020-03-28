
package edu.cibertec.jaad.ws.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.cibertec.jaad.ws package. 
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

    private final static QName _RegistrarResponse_QNAME = new QName("http://jaxws.ws.jaad.cibertec.edu/", "registrarResponse");
    private final static QName _ConsultarResponse_QNAME = new QName("http://jaxws.ws.jaad.cibertec.edu/", "consultarResponse");
    private final static QName _Registrar_QNAME = new QName("http://jaxws.ws.jaad.cibertec.edu/", "registrar");
    private final static QName _Consultar_QNAME = new QName("http://jaxws.ws.jaad.cibertec.edu/", "consultar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.cibertec.jaad.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Consultar }
     * 
     */
    public Consultar createConsultar() {
        return new Consultar();
    }

    /**
     * Create an instance of {@link Registrar }
     * 
     */
    public Registrar createRegistrar() {
        return new Registrar();
    }

    /**
     * Create an instance of {@link ConsultarResponse }
     * 
     */
    public ConsultarResponse createConsultarResponse() {
        return new ConsultarResponse();
    }

    /**
     * Create an instance of {@link RegistrarResponse }
     * 
     */
    public RegistrarResponse createRegistrarResponse() {
        return new RegistrarResponse();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.ws.jaad.cibertec.edu/", name = "registrarResponse")
    public JAXBElement<RegistrarResponse> createRegistrarResponse(RegistrarResponse value) {
        return new JAXBElement<RegistrarResponse>(_RegistrarResponse_QNAME, RegistrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.ws.jaad.cibertec.edu/", name = "consultarResponse")
    public JAXBElement<ConsultarResponse> createConsultarResponse(ConsultarResponse value) {
        return new JAXBElement<ConsultarResponse>(_ConsultarResponse_QNAME, ConsultarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.ws.jaad.cibertec.edu/", name = "registrar")
    public JAXBElement<Registrar> createRegistrar(Registrar value) {
        return new JAXBElement<Registrar>(_Registrar_QNAME, Registrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consultar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.ws.jaad.cibertec.edu/", name = "consultar")
    public JAXBElement<Consultar> createConsultar(Consultar value) {
        return new JAXBElement<Consultar>(_Consultar_QNAME, Consultar.class, null, value);
    }

}
