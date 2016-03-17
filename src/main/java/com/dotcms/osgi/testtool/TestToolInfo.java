package com.dotcms.osgi.testtool;

import org.apache.velocity.tools.view.servlet.ServletToolInfo;


public class TestToolInfo extends ServletToolInfo {
	public String getKey() {
		return "testtool";
	}

	public String getScope() {
		return "request";
	}

	public String getClassname() {
		return TestTool.class.getName();
	}

	public Object getInstance(Object initData) {
		TestTool viewTool = new TestTool();
		viewTool.init(initData);
		return viewTool;
	}
}
