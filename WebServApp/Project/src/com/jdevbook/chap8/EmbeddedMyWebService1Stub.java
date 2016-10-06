package com.jdevbook.chap8;
import oracle.soap.transport.http.OracleSOAPHTTPConnection;
import org.apache.soap.encoding.soapenc.BeanSerializer;
import org.apache.soap.encoding.SOAPMappingRegistry;
import org.apache.soap.util.xml.QName;
import java.net.URL;
import org.apache.soap.Constants;
import org.apache.soap.Fault;
import org.apache.soap.SOAPException;
import org.apache.soap.rpc.Call;
import org.apache.soap.rpc.Parameter;
import org.apache.soap.rpc.Response;
import java.util.Vector;
import java.util.Properties;

public class EmbeddedMyWebService1Stub 
{
  public EmbeddedMyWebService1Stub()
  {
    m_httpConnection = new OracleSOAPHTTPConnection();
    m_smr = new SOAPMappingRegistry();
  }

  public static void main(String[] args)
  {
    try
    {
      EmbeddedMyWebService1Stub stub = new EmbeddedMyWebService1Stub();
      // Add your own code here.
      System.out.println(stub.numberSquare(new Integer(12)));
    }
    catch(Exception ex)
    {
      ex.printStackTrace();
    }
  }

  private String _endpoint =
    "http://127.0.0.1:8988/WebServApp-Project-context-root/MyWebService1";

  public String getEndpoint()
  {
    return _endpoint;
  }

  public void setEndpoint(String endpoint)
  {
    _endpoint = endpoint;
  }

  private OracleSOAPHTTPConnection m_httpConnection = null;
  private SOAPMappingRegistry m_smr = null;

  public String numberSquare(Integer number) throws Exception
  {
    String returnVal = null;

    URL endpointURL = new URL(_endpoint);
    Call call = new Call();
    call.setSOAPTransport(m_httpConnection);
    call.setTargetObjectURI("MyWebService1");
    call.setMethodName("numberSquare");
    call.setEncodingStyleURI(Constants.NS_URI_SOAP_ENC);

    Vector params = new Vector();
    params.addElement(new Parameter("number"
      , java.lang.Integer.class, number, null));
    call.setParams(params);

    call.setSOAPMappingRegistry(m_smr);

    Response response = call.invoke(endpointURL, "");

    if (!response.generatedFault())
    {
      Parameter result = response.getReturnValue();
      returnVal = (String)result.getValue();
    }
    else
    {
      Fault fault = response.getFault();
      throw new SOAPException(fault.getFaultCode(), fault.getFaultString());
    }

    return returnVal;
  }

  public void setMaintainSession(boolean maintainSession)
  {
    m_httpConnection.setMaintainSession(maintainSession);
  }

  public boolean getMaintainSession()
  {
    return m_httpConnection.getMaintainSession();
  }

  public void setTransportProperties(Properties props)
  {
    m_httpConnection.setProperties(props);
  }

  public Properties getTransportProperties()
  {
    return m_httpConnection.getProperties();
  }
}