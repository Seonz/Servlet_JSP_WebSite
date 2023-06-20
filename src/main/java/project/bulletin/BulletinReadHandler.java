package project.bulletin;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.DAO.CommunityDAO;
import project.VO.CommunityVO;

/**
 * Servlet implementation class BulletinReadHandler
 */
@WebServlet("/bulletinread.do")
public class BulletinReadHandler extends HttpServlet {
	CommunityDAO cd;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		cd = CommunityDAO.getInstance();
		searchVO
		Map<String, CommunityVO> map = new HashMap<String, CommunityVO>();
		List<CommunityVO> communityList = cd.readCommunity(null)
		map.put("communityList", )
		String nextPage = "/board/comboardlist.jsp";
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}
}
