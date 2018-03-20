package com.test.vestirssproject.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Related{

	@SerializedName("__prefix")
	private String prefix;

	@SerializedName("link")
	private List<LinkItem> link;

	public void setPrefix(String prefix){
		this.prefix = prefix;
	}

	public String getPrefix(){
		return prefix;
	}

	public void setLink(List<LinkItem> link){
		this.link = link;
	}

	public List<LinkItem> getLink(){
		return link;
	}

	@Override
 	public String toString(){
		return 
			"Related{" + 
			"__prefix = '" + prefix + '\'' + 
			",link = '" + link + '\'' + 
			"}";
		}
}