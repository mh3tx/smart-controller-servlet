package interf;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Formato 
{
	  public void gerarResposta(HttpServletRequest request, HttpServletResponse response) throws IOException;
}