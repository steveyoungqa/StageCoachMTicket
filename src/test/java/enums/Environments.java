package enums;

import stepDefinition.AmazeStepdefs;

public enum Environments {
	UAT("https://awsuat.virgintrainseastcoast.com/"),
	RSPA("https://awsrsp.virgintrainseastcoast.com");


	private String value;
	private Environments(String value){
		
		this.value = value;
	}
	
	public String getValue(){
		
		return this.value;
	}
	
	public static String getUrl() {
		return Environments.valueOf(AmazeStepdefs.environment).getValue();
	}
}
