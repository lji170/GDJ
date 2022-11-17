package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import repository.FreeDao;

public class FreeListService implements FreeService {


	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		request.setAttribute("frees", FreeDao.getInstance().selectAllFrees());
		
		
		ActionForward af = new ActionForward();
		af.setView("/free/list.jsp");
		af.setRedirect(false);
		return af;
		
	}

}
