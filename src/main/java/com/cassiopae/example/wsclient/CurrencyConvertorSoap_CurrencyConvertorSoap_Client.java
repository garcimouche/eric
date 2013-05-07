package com.cassiopae.example.wsclient;

/**
 * Please modify this class to meet your needs This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-05-07T11:18:05.672-04:00
 * Generated source version: 2.7.4
 * 
 */
public final class CurrencyConvertorSoap_CurrencyConvertorSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://www.webserviceX.NET/", "CurrencyConvertor");

    private static Logger logger = Logger.getLogger(CurrencyConvertorSoap_CurrencyConvertorSoap_Client.class);

    private CurrencyConvertorSoap_CurrencyConvertorSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CurrencyConvertor.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                }
                else {
                    wsdlURL = new URL(args[0]);
                }
            }
            catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        CurrencyConvertor ss = new CurrencyConvertor(wsdlURL, SERVICE_NAME);
        CurrencyConvertorSoap port = ss.getCurrencyConvertorSoap();

        logger.info("Invoking conversionRate...");
        net.webservicex.Currency _conversionRate_fromCurrency = net.webservicex.Currency.CAD;
        net.webservicex.Currency _conversionRate_toCurrency = net.webservicex.Currency.USD;
        double _conversionRate__return = port.conversionRate(_conversionRate_fromCurrency, _conversionRate_toCurrency);
        logger.info("conversionRate.result=" + _conversionRate__return);

        System.exit(0);
    }

}