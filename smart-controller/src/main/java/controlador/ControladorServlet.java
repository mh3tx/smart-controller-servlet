package controlador;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interf.Formato;
import service.FormatoHTML;
import service.FormatoJSON;
import service.FormatoTextoPadrao;

@WebServlet("/controlador")
public class ControladorServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private Formato formato;
    private Map<String, Formato> formatos;	
       
    public ControladorServlet() 
    {
        super();
        
        formatos = new HashMap<>();
        formatos.put("text/html", new FormatoHTML());
        formatos.put("application/json", new FormatoJSON());
        formatos.put("text/plain", new FormatoTextoPadrao());        
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String accept = request.getHeader("Accept");
        Formato formato = formatos.getOrDefault(accept, new FormatoTextoPadrao());
        formato.gerarResposta(request, response);
    }

}