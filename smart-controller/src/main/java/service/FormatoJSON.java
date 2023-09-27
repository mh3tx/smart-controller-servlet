package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interf.Formato;

public class FormatoJSON implements Formato
{
	public void gerarResposta(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
	    response.setContentType("application/json");

	    response.getWriter().println("{");
	    response.getWriter().println("\"mensagem\": \"Resposta em JSON...\"");
	    response.getWriter().println("}");		
	}
}