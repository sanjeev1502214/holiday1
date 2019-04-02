package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import DAO.UserDAOImpl;
import Model.User;

/**
 * Servlet implementation class UserRegisterServlet
 */
@WebServlet("/UserReg")
public class UserReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String F_name=request.getParameter("firstname");
		System.out.println(F_name);
		String L_name=request.getParameter("lastname");
		String Gender=request.getParameter("gender");
		String E_Mail=request.getParameter("emailid");
		long Contact_num=Long.parseLong(request.getParameter("contactno"));
		int Age=Integer.parseInt(request.getParameter("age"));
		String Password=request.getParameter("password");
		User u_obj=new User(F_name, L_name, Gender, E_Mail, Contact_num, Age, Password);
		UserDAO u_dao=new UserDAOImpl();
		try {
			System.out.println("Sending for connection");
			u_dao.Create_UserDet(u_obj);
			System.out.println("User Created");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("signIn.jsp");
	}

}