package service;

import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import domain.Free;
import repository.FreeDao;

public class FreeDetailService implements FreeService {

		@Override
		public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			
			Optional<String> opt = Optional.ofNullable(request.getParameter("FreeNo"));
			int FreeNo = Integer.parseInt(opt.orElse("0"));
			
			
			Free free = FreeDao.getInstance().selectFreeByNo(FreeNo);
			
			
			if(free == null) {
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('" + FreeNo + "번 게시글의 정보가 없습니다.')");
				out.println("location.href='" + request.getContextPath() + "/free/list.do'");
				out.println("</script>");
				out.close();
			} else {
				
				request.setAttribute("free", free);
				
				ActionForward af = new ActionForward();
				af.setView("/free/detail.jsp");
				af.setRedirect(false);
				return af;
			}
			
			return null;  
			
		}

	}
