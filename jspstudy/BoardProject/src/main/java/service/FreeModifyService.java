package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import domain.Free;
import repository.FreeDao;

public class FreeModifyService implements FreeService {

	@Override
	public ActionForward  execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
	
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int FreeNo = Integer.parseInt(request.getParameter("FreeNo"));
		
		
		Free free = new Free();
		free.setTitle(title);
		free.setContent(content);
	
		
		int result = FreeDao.getInstance().updateFree(free);
		
		
		PrintWriter out = response.getWriter();
		if(result > 0) {
			out.println("<script>");
			out.println("alert('게시글이 수정되었습니다.')");
			out.println("location.href='" + request.getContextPath() + "/board/detail.do?boardNo=" + FreeNo + "'");
			out.println("</script>");
		} else {
			out.println("<script>");
			out.println("alert('게시글 수정이 실패했습니다.')");
			out.println("history.back()");
			out.println("</script>");
		}
		out.close();
		
		return null;	
		
	}

}
