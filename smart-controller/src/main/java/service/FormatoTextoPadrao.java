package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interf.Formato;

public class FormatoTextoPadrao implements Formato 
{
	public void gerarResposta(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
	    response.setContentType("text/plain");

	    response.getWriter().println("Resposta em texto simples...");		
	}
}