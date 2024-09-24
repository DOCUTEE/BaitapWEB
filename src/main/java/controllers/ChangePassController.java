package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import services.UserService;
import services.UserServiceImpl;

import java.io.IOException;

/**
 * Servlet implementation class ChangePassController
 */
@WebServlet(urlPatterns = "/views/changePassword")
public class ChangePassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String mail = request.getParameter("mail");
		String newPassword = request.getParameter("newPassword");
		UserService userService = new UserServiceImpl();
		if (userService.checkExistEmail(mail)) {
			userService.changePass(mail,newPassword);
			response.getWriter().append("Đổi mật khẩu thành công");
			response.sendRedirect(request.getContextPath() + "/views/home.jsp");
			return;
		}
		else response.getWriter().append("Mail không tồn tại");
	}

}
