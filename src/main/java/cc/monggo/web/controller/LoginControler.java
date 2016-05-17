package cc.monggo.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cc.monggo.domain.LoginForm;

//注解方式（不需要在上下文中配置bean）
@Controller
public class LoginControler {
	
	@RequestMapping(value = "login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, LoginForm command) {
		String username = command.getUsername();
		ModelAndView mv = new ModelAndView("/index/index", "command", "LOGIN SUCCESS, " + username);
		return mv;
	}
}

//非注解方式(需要在上下文中配置bean)
//public class LoginControler implements Controller {
//
//	public ModelAndView handleRequest(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		String username = request.getParameter("username");
//		ModelAndView mv = new ModelAndView("index", "command",
//				"LOGIN SUCCESS, " + username);
//		return mv;
//	}
//
//	public Class<? extends Annotation> annotationType() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String value() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}