package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("rss")
	private Rss rss;

	public void setRss(Rss rss){
		this.rss = rss;
	}

	public Rss getRss(){
		return rss;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"rss = '" + rss + '\'' + 
			"}";
		}
}