package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Gestiondb;
import model.Etudiant;

/**
 * Servlet implementation class Verfication
 */
@WebServlet("/Verfication")
public class Verfication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Gestiondb gdb = new Gestiondb();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verfication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String user = request.getParameter("nom");
	    String mp = request.getParameter("mp");
	    if (gdb.verif(user, mp)==true) {
	       
	        List<Etudiant> list=gdb.getAllEtudiants();
	        request.setAttribute("list",list);
	        request.getRequestDispatcher("Liste.jsp").forward(request, response);
	    } else response.sendRedirect("Authentification.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}








    

