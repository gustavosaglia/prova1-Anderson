package Cadastro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Pessoas.Pessoas;
import banco.bancoPessoas;

/**
 * Servlet implementation class CadastrarPessoas
 */
@WebServlet("/CadastrarPessoas")
public class CadastrarPessoas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarPessoas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String telefone = req.getParameter("telefone");
		
		Pessoas u = new Pessoas();
		
		u.setEmail(email);
		u.setNome(nome);
		u.setTelefone(telefone);
		
	 for(Pessoas ua: banco.bancoPessoas) {
		//	u.getEmail();
			
		//  if (u.getEmail().equals(email) ) {
		//	  RequestDispatcher rd = req.getRequestDispatcher("/pessoaCadastrada.jsp");
		//	  req.setAttribute("email", u);
		//	  rd.forward(req, resp);
			  
		// }else {
			  
			bancoPessoas.listaPessoas.add(u);
			
			RequestDispatcher rd = req.getRequestDispatcher("/pessoaCadastrada.jsp");
			req.setAttribute("Pessoas", u);
			req.setAttribute("lista", bancoPessoas.listaPessoas);
			rd.forward(req, resp);
			//doGet(request, response);
	     //  	}
	// }	
  }
}