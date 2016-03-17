package com.dotcms.osgi.testtool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.tools.view.context.ViewContext;
import org.apache.velocity.tools.view.tools.ViewTool;

public class TestTool implements ViewTool {

	private HttpServletRequest request;
	private HttpServletResponse response;

	public void init(Object obj) {
		if (obj instanceof ViewContext) {
			this.request = ((ViewContext) obj).getRequest();
			this.response = ((ViewContext) obj).getResponse();
		}
	}

	
	public String test() throws Throwable {
		return "TEST TOOL WORKS!";
	}

	
	
	
	
}
