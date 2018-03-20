package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Enclosure{

	@SerializedName("_type")
	private String type;

	@SerializedName("_url")
	private String url;

	@SerializedName("_width")
	private String width;

	@SerializedName("_height")
	private String height;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setWidth(String width){
		this.width = width;
	}

	public String getWidth(){
		return width;
	}

	public void setHeight(String height){
		this.height = height;
	}

	public String getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"Enclosure{" + 
			"_type = '" + type + '\'' + 
			",_url = '" + url + '\'' + 
			",_width = '" + width + '\'' + 
			",_height = '" + height + '\'' + 
			"}";
		}
}