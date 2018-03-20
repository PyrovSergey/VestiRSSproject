package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Content{

	@SerializedName("__cdata")
	private String cdata;

	@SerializedName("__prefix")
	private String prefix;

	public void setCdata(String cdata){
		this.cdata = cdata;
	}

	public String getCdata(){
		return cdata;
	}

	public void setPrefix(String prefix){
		this.prefix = prefix;
	}

	public String getPrefix(){
		return prefix;
	}

	@Override
 	public String toString(){
		return 
			"Content{" + 
			"__cdata = '" + cdata + '\'' + 
			",__prefix = '" + prefix + '\'' + 
			"}";
		}
}