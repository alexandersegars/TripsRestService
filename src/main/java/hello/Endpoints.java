package greetings;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Endpoints listing object.
 * 
 * A list of Restful service endpoints.
 */
public class Endpoints {

  /**
   * list of Restful service endpoints
   */
  private List endpoints;

  /**
   * Constructor.
   * 
   * @param mapping RequestMappingInfo instances for this controller
   */
  public Endpoints(RequestMappingHandlerMapping mapping) {
    endpoints = new ArrayList<String>();
    Set mappings = mapping.getHandlerMethods().keySet();
    Iterator<RequestMappingInfo> itr = mappings.iterator();
    while (itr.hasNext()) {
      endpoints.add(itr.next().toString());
    }
  }

  /**
   * @return list of Restful service endpoints
   */
  public List getEndpoints() {
    return this.endpoints;
  }

}