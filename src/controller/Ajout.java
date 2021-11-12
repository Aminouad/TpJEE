package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Gestiondb;
import model.Etudiant;

/**
 * Servlet implementation class Ajout
 */
@WebServlet("/Ajout")
public class Ajout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Gestiondb gdb=new Gestiondb();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(request.getParameter("numero"));
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");

        String tel = request.getParameter("tel");
        Etudiant e=new Etudiant(numero,prenom,nom,tel);
        gdb.addEtudiant(e);
        List <Etudiant> list=gdb.getAllEtudiants();
        request.setAttribute("list",list);
        request.getRequestDispatcher("Liste.jsp").forward(request,response);

		doGet(request, response);
	}

}
