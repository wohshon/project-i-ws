package com.demo.ihis.ws;

import java.math.BigInteger;

import org.apache.camel.Exchange;
import org.apache.cxf.message.MessageContentsList;

import com.mohh.nehr.ControlHeaderType;
import com.mohh.nehr.PutLabResult;
import com.mohh.nehr.PutLabResultReply;
import com.mohh.nehr.ResultStatusType;

public class ProcessBean {

	public void returnReply(Exchange exchange) {
		System.out.println("INSIDE BEAN****");
		MessageContentsList list=(MessageContentsList)exchange.getIn().getBody();
		PutLabResult labResult=(PutLabResult)list.get(0);
		
		PutLabResultReply reply=new PutLabResultReply();
		ControlHeaderType ch=new ControlHeaderType();
		ch.setMsgID(labResult.getControlHeader().getMsgID());
		reply.setControlHeader(ch);
		ResultStatusType status=new ResultStatusType();
		status.setStatusCode(BigInteger.valueOf(1000L));
		status.setStatusDescription("ok");
		reply.setResultStatus(status);
		exchange.getOut().setBody(reply);
		
	}


	public void dummyReply(Exchange exchange) {
		//System.out.println(exchange.getIn().getHeader("reqObj").getClass());
		PutLabResult result=(PutLabResult)exchange.getProperty("REQUEST_OBJ");
		System.out.println("HEADER VALUE:"+result);
		PutLabResultReply reply=new PutLabResultReply();
		ControlHeaderType ch=new ControlHeaderType();
		ch.setMsgID(result.getControlHeader().getMsgID());
		reply.setControlHeader(ch);
		ResultStatusType status=new ResultStatusType();
		status.setStatusCode(BigInteger.valueOf(1000L));
		status.setStatusDescription("ok");
		reply.setResultStatus(status);
		exchange.getOut().setBody(reply);
		
	}

	public void extract(Exchange exchange) {
		MessageContentsList list=(MessageContentsList)exchange.getIn().getBody();
		PutLabResult labResult=(PutLabResult)list.get(0);
		//Message msg=exchange.getIn();
		
		exchange.getIn().getBody(MessageContentsList.class);
	}
	public void convertToString(Exchange exchange) {
		MessageContentsList list=(MessageContentsList)exchange.getIn().getBody();
		PutLabResult result=(PutLabResult)list.get(0);
		exchange.setProperty("REQUEST_OBJ",result);
		//keep original body in header
		System.out.println("***-"+exchange.getIn().getBody().toString()+"-******");
		System.out.println("***-"+exchange.getIn().getBody(String.class)+"-******");
		exchange.getOut().setBody(exchange.getIn().getBody().toString());
	}
}
