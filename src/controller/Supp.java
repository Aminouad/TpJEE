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
 * Servlet implementation class Supp
 */
@WebServlet("/Supp")
public class Supp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Gestiondb gdb = new Gestiondb();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Supp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(request.getParameter("num"));
        gdb.deleteEtudiant(num);
        List<Etudiant> list = gdb.getAllEtudiants();
        request.setAttribute("list", list);
        request.getRequestDispatcher("Liste.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
