package com.mohh.nehr;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.0.redhat-60024
 * 2016-09-07T02:19:48.332+08:00
 * Generated source version: 2.6.0.redhat-60024
 * 
 */
@WebService(targetNamespace = "http://www.mohh.com/nehr", name = "putLabResultWebService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PutLabResultWebService {

    @WebMethod
    @WebResult(name = "putLabResult_Reply", targetNamespace = "http://www.mohh.com/nehr", partName = "outparameters")
    public PutLabResultReply putLabResult(
        @WebParam(partName = "inparameters", name = "putLabResult", targetNamespace = "http://www.mohh.com/nehr")
        PutLabResult inparameters
    );
}