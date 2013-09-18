package com.ddoplanner.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.logging.client.HasWidgetsLogHandler;
import com.google.gwt.user.client.ui.VerticalPanel;

public final class LogHandler {

	private static Logger logger = Logger.getLogger("");
	private static VerticalPanel loggerPanel = new VerticalPanel();
	
	public static void init(){
		logger.addHandler(new HasWidgetsLogHandler(loggerPanel));
	}
	
	public static void info(String s){ logger.log(Level.INFO, s); };
	
	public static Logger getLogger(){ return logger; };
	public static VerticalPanel getLogPanel(){ return loggerPanel; };
}
