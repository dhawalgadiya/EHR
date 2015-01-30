package ehr.data.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;



@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class EHRService {

	@WebMethod(operationName = "HelloWorld")
	public String sayHello(@WebParam(name = "Name") String name) 
	{
		return "Hello"+name;
	}
}
