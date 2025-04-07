package kr.or.human.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class Cfilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// utf-8 세팅
		request.setCharacterEncoding("utf-8");
		// 내보낼때 무조건 html로 안하는게 좋음
		// response.setContentType("text/html; charset=utf-8;");
		
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
