
package org.soap1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DisplayAssortment", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", wsdlLocation = "http://localhost:8081/StoreSvcWeb/displayassortment?wsdl")
public class DisplayAssortment
    extends Service
{

    private final static URL DISPLAYASSORTMENT_WSDL_LOCATION;
    private final static WebServiceException DISPLAYASSORTMENT_EXCEPTION;
    private final static QName DISPLAYASSORTMENT_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/passexam", "DisplayAssortment");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/StoreSvcWeb/displayassortment?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DISPLAYASSORTMENT_WSDL_LOCATION = url;
        DISPLAYASSORTMENT_EXCEPTION = e;
    }

    public DisplayAssortment() {
        super(__getWsdlLocation(), DISPLAYASSORTMENT_QNAME);
    }

    public DisplayAssortment(WebServiceFeature... features) {
        super(__getWsdlLocation(), DISPLAYASSORTMENT_QNAME, features);
    }

    public DisplayAssortment(URL wsdlLocation) {
        super(wsdlLocation, DISPLAYASSORTMENT_QNAME);
    }

    public DisplayAssortment(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DISPLAYASSORTMENT_QNAME, features);
    }

    public DisplayAssortment(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DisplayAssortment(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StoreService
     */
    @WebEndpoint(name = "DisplayAssortmentPort")
    public StoreService getDisplayAssortmentPort() {
        return super.getPort(new QName("http://asu.dgtu.donetsk.ua/ex/passexam", "DisplayAssortmentPort"), StoreService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StoreService
     */
    @WebEndpoint(name = "DisplayAssortmentPort")
    public StoreService getDisplayAssortmentPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://asu.dgtu.donetsk.ua/ex/passexam", "DisplayAssortmentPort"), StoreService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DISPLAYASSORTMENT_EXCEPTION!= null) {
            throw DISPLAYASSORTMENT_EXCEPTION;
        }
        return DISPLAYASSORTMENT_WSDL_LOCATION;
    }

}
