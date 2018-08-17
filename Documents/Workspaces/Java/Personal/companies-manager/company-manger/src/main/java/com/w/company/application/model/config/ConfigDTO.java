package com.w.company.application.model.config;

public class ConfigDTO {

	public static final int VERSION;

	static {
		VERSION = 1;	
	}


	public String getVERSIONText() {
		return VERSION + "";
	}

}
