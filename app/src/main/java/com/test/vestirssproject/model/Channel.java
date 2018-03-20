package com.test.vestirssproject.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Channel{

	@SerializedName("analytics")
	private List<AnalyticsItem> analytics;

	@SerializedName("image")
	private Image image;

	@SerializedName("item")
	private List<ItemItem> item;

	@SerializedName("adNetwork")
	private AdNetwork adNetwork;

	@SerializedName("about")
	private String about;

	@SerializedName("link")
	private String link;

	@SerializedName("description")
	private String description;

	@SerializedName("logo")
	private List<LogoItem> logo;

	@SerializedName("language")
	private String language;

	@SerializedName("encoding")
	private String encoding;

	@SerializedName("title")
	private String title;

	public void setAnalytics(List<AnalyticsItem> analytics){
		this.analytics = analytics;
	}

	public List<AnalyticsItem> getAnalytics(){
		return analytics;
	}

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setItem(List<ItemItem> item){
		this.item = item;
	}

	public List<ItemItem> getItem(){
		return item;
	}

	public void setAdNetwork(AdNetwork adNetwork){
		this.adNetwork = adNetwork;
	}

	public AdNetwork getAdNetwork(){
		return adNetwork;
	}

	public void setAbout(String about){
		this.about = about;
	}

	public String getAbout(){
		return about;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setLogo(List<LogoItem> logo){
		this.logo = logo;
	}

	public List<LogoItem> getLogo(){
		return logo;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setEncoding(String encoding){
		this.encoding = encoding;
	}

	public String getEncoding(){
		return encoding;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"Channel{" + 
			"analytics = '" + analytics + '\'' + 
			",image = '" + image + '\'' + 
			",item = '" + item + '\'' + 
			",adNetwork = '" + adNetwork + '\'' + 
			",about = '" + about + '\'' + 
			",link = '" + link + '\'' + 
			",description = '" + description + '\'' + 
			",logo = '" + logo + '\'' + 
			",language = '" + language + '\'' + 
			",encoding = '" + encoding + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}