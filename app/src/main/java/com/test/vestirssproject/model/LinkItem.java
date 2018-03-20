package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LinkItem{

	@SerializedName("__text")
	private String text;

	@SerializedName("_img")
	private String img;

	@SerializedName("_url")
	private String url;

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setImg(String img){
		this.img = img;
	}

	public String getImg(){
		return img;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"LinkItem{" + 
			"__text = '" + text + '\'' + 
			",_img = '" + img + '\'' + 
			",_url = '" + url + '\'' + 
			"}";
		}
}