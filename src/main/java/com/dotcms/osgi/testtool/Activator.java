package com.dotcms.osgi.testtool;


import com.dotcms.repackage.org.osgi.framework.BundleContext;
import com.dotmarketing.osgi.GenericBundleActivator;
import com.dotmarketing.util.Logger;

public class Activator extends GenericBundleActivator {
	public void start(BundleContext bundleContext) throws Exception {
		Logger.info(getClass(), "--------- Starting TEST Activator --------- " + TestTool.class.getCanonicalName());
		initializeServices(bundleContext);
		
		registerViewToolService(bundleContext, new TestToolInfo());
		Logger.info(getClass(), "--------- Started  TEST Activator --------- " + TestTool.class.getCanonicalName());
	}

	public void stop(BundleContext context) throws Exception {
		unregisterViewToolServices();
		Logger.info(getClass(), "Stopping " + TestTool.class.getCanonicalName());
	}
}
