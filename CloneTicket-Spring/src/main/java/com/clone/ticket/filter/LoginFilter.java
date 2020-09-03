package com.clone.ticket.filter;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/users/private/*")
public class LoginFilter implements Filter{
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		
		String users_id = (String)session.getAttribute("users_id");
		
		if(users_id != null) { //로그인 상태
			chain.doFilter(request, response);
		}else { //로그인 안된 상태
			
			//원래 가려던 url정보 읽어온다.
			String url = req.getRequestURI();
			
			//GET방식 전송 파라미터를 query string으로 얻어온다.
			String query = req.getQueryString();
			
			//인코딩
			String encodedUrl = null;
			if(query==null) { //전송 파라미터가 없으면
				encodedUrl = URLEncoder.encode(url);
			}else {
				encodedUrl = URLEncoder.encode(url+"?"+query);
			}
			
			//로그인 폼으로 이동
			HttpServletResponse res = (HttpServletResponse)response;
			String cPath = req.getContextPath();
			res.sendRedirect(cPath+"/users/login-form.do?url="+encodedUrl);
		}
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
