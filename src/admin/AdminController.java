package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.AdminCommandMapping;
import util.CommandMapping;

/**
 * Servlet implementation class AdminController
 */
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException {
		String path=getServletContext().getRealPath(getInitParameter("adminCommandPath"));
		AdminCommandMapping.mapping(path);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String action=request.getParameter("action");
		System.out.println("action = " + action);
		String nextPage=AdminCommandMapping.getCommand(action).execute(request, response);
		System.out.println("nextPage = " + nextPage);
		request.getRequestDispatcher(nextPage).forward(request, response);
	}

}
