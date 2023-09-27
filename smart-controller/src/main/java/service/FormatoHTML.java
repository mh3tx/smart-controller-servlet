package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interf.Formato;

public class FormatoHTML implements Formato 
{
  public void gerarResposta(HttpServletRequest request, HttpServletResponse response) throws IOException 
  {
	response.setContentType("text/html");
	
    response.getWriter().println("<html>");
    response.getWriter().println("<head>");
    response.getWriter().println("<title>Resposta em HTML</title>");
    response.getWriter().println("</head>");
    response.getWriter().println("<body>");
    response.getWriter().println("<h1>Resposta em HTML...</h1>");
    response.getWriter().println("</body>");
    response.getWriter().println("</html>");
  }
}