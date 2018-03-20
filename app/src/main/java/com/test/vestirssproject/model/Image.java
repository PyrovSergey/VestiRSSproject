package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Image{

	@SerializedName("link")
	private String link;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
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
			"Image{" + 
			"link = '" + link + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}