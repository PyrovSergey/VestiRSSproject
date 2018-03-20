package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AdNetwork{

	@SerializedName("__cdata")
	private String cdata;

	@SerializedName("__prefix")
	private String prefix;

	@SerializedName("_type")
	private String type;

	@SerializedName("_turbo-ad-id")
	private String turboAdId;

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

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTurboAdId(String turboAdId){
		this.turboAdId = turboAdId;
	}

	public String getTurboAdId(){
		return turboAdId;
	}

	@Override
 	public String toString(){
		return 
			"AdNetwork{" + 
			"__cdata = '" + cdata + '\'' + 
			",__prefix = '" + prefix + '\'' + 
			",_type = '" + type + '\'' + 
			",_turbo-ad-id = '" + turboAdId + '\'' + 
			"}";
		}
}