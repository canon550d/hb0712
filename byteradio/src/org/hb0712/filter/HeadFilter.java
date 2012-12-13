package org.hb0712.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.hb0712.CoverResponse;

public class HeadFilter extends HttpServlet implements Filter {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain fc) throws IOException, ServletException {
		// TODO Auto-generated method stub
		CoverResponse cr = new CoverResponse((HttpServletResponse)response);
		fc.doFilter(request, cr);
		//´¦ÀíÌæ»»
		String content = cr.getContent();
		String[] ss = content.split("<br class='xy'/>");
		if(ss.length == 3){
			content = ss[0]+ss[2];
			content = content.replace("scripts_for_layout", ss[1]);
		}
		response.getWriter().print(content);

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
