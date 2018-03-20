package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AnalyticsItem{

	@SerializedName("__prefix")
	private String prefix;

	@SerializedName("_type")
	private String type;

	@SerializedName("_params")
	private String params;

	public void setPrefix(String prefix){
		this.prefix = prefix;
	}

	public String getPrefix(){
		return prefix;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setParams(String params){
		this.params = params;
	}

	public String getParams(){
		return params;
	}

	@Override
 	public String toString(){
		return 
			"AnalyticsItem{" + 
			"__prefix = '" + prefix + '\'' + 
			",_type = '" + type + '\'' + 
			",_params = '" + params + '\'' + 
			"}";
		}
}