import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
 
public class SessionServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    /*
    try {
      Client client = Client.create();
 
      WebResource webResource = client.resource("http://rest.codemash.org/api/sessions.json");
 
      ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
 
      if (response.getStatus() != 200) {
        throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
      }
 
      String output = response.getEntity(String.class);
 
      System.out.println("Server output:\n");
      System.out.println(output);
 
    } catch (Exception e) {
      e.printStackTrace();
    }
*/
    resp.getOutputStream().write("Hello, World.".getBytes());

  }
 
  public static void main(String[] args) {
    try {
 
      Client client = Client.create();
 
      WebResource webResource = client.resource("http://rest.codemash.org/api/sessions.json");
 
      ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
 
      if (response.getStatus() != 200) {
        throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
      }
 
      String output = response.getEntity(String.class);
 
      System.out.println("Output from Server .... \n");
      System.out.println(output);
 
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
