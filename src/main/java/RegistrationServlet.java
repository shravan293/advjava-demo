import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegistrationServlet implements Servlet{

    public RegistrationServlet() {
    	System.out.println("RegistrationServlet object created");
    }
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("while After immediate Object creation");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("At user Request");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("At the undeployement or shutdown");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}


}
