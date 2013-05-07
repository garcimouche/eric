package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-05-07T11:48:44.930-04:00
 * Generated source version: 2.7.4
 * 
 */
@WebServiceClient(name = "CurrencyConvertor", 
                  wsdlLocation = "file:/home/franck/atuer/eric/src/main/resources/cc.wsdl",
                  targetNamespace = "http://www.webserviceX.NET/") 
public class CurrencyConvertor extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.webserviceX.NET/", "CurrencyConvertor");
    public final static QName CurrencyConvertorHttpPost = new QName("http://www.webserviceX.NET/", "CurrencyConvertorHttpPost");
    public final static QName CurrencyConvertorSoap = new QName("http://www.webserviceX.NET/", "CurrencyConvertorSoap");
    public final static QName CurrencyConvertorSoap12 = new QName("http://www.webserviceX.NET/", "CurrencyConvertorSoap12");
    public final static QName CurrencyConvertorHttpGet = new QName("http://www.webserviceX.NET/", "CurrencyConvertorHttpGet");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/franck/atuer/eric/src/main/resources/cc.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CurrencyConvertor.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/franck/atuer/eric/src/main/resources/cc.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CurrencyConvertor(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CurrencyConvertor(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyConvertor() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns CurrencyConvertorHttpPost
     */
    @WebEndpoint(name = "CurrencyConvertorHttpPost")
    public CurrencyConvertorHttpPost getCurrencyConvertorHttpPost() {
        return super.getPort(CurrencyConvertorHttpPost, CurrencyConvertorHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyConvertorHttpPost
     */
    @WebEndpoint(name = "CurrencyConvertorHttpPost")
    public CurrencyConvertorHttpPost getCurrencyConvertorHttpPost(WebServiceFeature... features) {
        return super.getPort(CurrencyConvertorHttpPost, CurrencyConvertorHttpPost.class, features);
    }
    /**
     *
     * @return
     *     returns CurrencyConvertorSoap
     */
    @WebEndpoint(name = "CurrencyConvertorSoap")
    public CurrencyConvertorSoap getCurrencyConvertorSoap() {
        return super.getPort(CurrencyConvertorSoap, CurrencyConvertorSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyConvertorSoap
     */
    @WebEndpoint(name = "CurrencyConvertorSoap")
    public CurrencyConvertorSoap getCurrencyConvertorSoap(WebServiceFeature... features) {
        return super.getPort(CurrencyConvertorSoap, CurrencyConvertorSoap.class, features);
    }
    /**
     *
     * @return
     *     returns CurrencyConvertorSoap
     */
    @WebEndpoint(name = "CurrencyConvertorSoap12")
    public CurrencyConvertorSoap getCurrencyConvertorSoap12() {
        return super.getPort(CurrencyConvertorSoap12, CurrencyConvertorSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyConvertorSoap
     */
    @WebEndpoint(name = "CurrencyConvertorSoap12")
    public CurrencyConvertorSoap getCurrencyConvertorSoap12(WebServiceFeature... features) {
        return super.getPort(CurrencyConvertorSoap12, CurrencyConvertorSoap.class, features);
    }
    /**
     *
     * @return
     *     returns CurrencyConvertorHttpGet
     */
    @WebEndpoint(name = "CurrencyConvertorHttpGet")
    public CurrencyConvertorHttpGet getCurrencyConvertorHttpGet() {
        return super.getPort(CurrencyConvertorHttpGet, CurrencyConvertorHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyConvertorHttpGet
     */
    @WebEndpoint(name = "CurrencyConvertorHttpGet")
    public CurrencyConvertorHttpGet getCurrencyConvertorHttpGet(WebServiceFeature... features) {
        return super.getPort(CurrencyConvertorHttpGet, CurrencyConvertorHttpGet.class, features);
    }

}
