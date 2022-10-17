package rectangle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Override
public class ActionForward execute(HttpServletRequest request, HttpServletResponse reponse); 

	// 요청 파라미터
	double width = Double.parseDouble(request.getParameter("width")):
	double height = Double.parseDouble(request.getParameter("height"));
	
	// 포워드 할 데이터
	request.setAttribute("width", width);
	request.setAttribute("height", height);
	request.setAttribute("area", width * height);
	request.setAttribute("shape", "rectangle");
	


