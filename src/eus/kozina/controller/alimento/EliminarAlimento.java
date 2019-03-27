package eus.kozina.controller.alimento;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eus.kozina.model.bean.Alimento;
import eus.kozina.model.daoimpl.AlimentoModeloImp;

/**
 * Servlet implementation class eliminar
 * hace el delete del alimento
 */
@WebServlet("/alimento/eliminar")
public class EliminarAlimento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarAlimento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.parseInt(request.getParameter("id"));
		AlimentoModeloImp alimentoModelo = new AlimentoModeloImp();
		alimentoModelo.delete(id);
		
		response.sendRedirect(request.getContextPath()+"/alimentos");
//		ArrayList<Alimento> alimentos = alimentoModelo.selectAll();
//		
//		request.setAttribute("alimentos", alimentos);
//		
//		request.getRequestDispatcher("verTodos.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	*/

}
