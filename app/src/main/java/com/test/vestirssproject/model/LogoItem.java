package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LogoItem{

	@SerializedName("__text")
	private String text;

	@SerializedName("__prefix")
	private String prefix;

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
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
			"LogoItem{" + 
			"__text = '" + text + '\'' + 
			",__prefix = '" + prefix + '\'' + 
			"}";
		}
}