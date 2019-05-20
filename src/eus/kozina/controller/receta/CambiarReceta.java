package eus.kozina.controller.receta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eus.kozina.model.bean.Receta;
import eus.kozina.model.daoimpl.RecetaModeloImp;

/**
 * Servlet implementation class CambiarReceta
 * hace un update de una receta
 */
@WebServlet("/receta/cambiar")
public class CambiarReceta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CambiarReceta() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String descripcion = request.getParameter("descripcion");
		String elavoracion = request.getParameter("elavoracion");
		
//		String nombreAlimentos = request.getParameter("nombreAlimento");
		
		Receta receta = new Receta(nombre);
		receta.setId(id);
		receta.setDescripcion(descripcion);
		receta.setElavoracion(elavoracion);
		
		RecetaModeloImp recetaModelo = new RecetaModeloImp();
		recetaModelo.update(receta);
		
		response.sendRedirect(request.getContextPath() + "/receta/ver?id=" + id);
	}

}
