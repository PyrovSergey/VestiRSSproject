package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ItemItem{

	@SerializedName("full-text")
	private FullText fullText;

	@SerializedName("related")
	private Related related;

	@SerializedName("enclosure")
	private Enclosure enclosure;

	@SerializedName("amplink")
	private String amplink;

	@SerializedName("link")
	private String link;

	@SerializedName("description")
	private String description;

	@SerializedName("_turbo")
	private String turbo;

	@SerializedName("title")
	private String title;

	@SerializedName("category")
	private String category;

	@SerializedName("pubDate")
	private String pubDate;

	@SerializedName("content")
	private Content content;

	public void setFullText(FullText fullText){
		this.fullText = fullText;
	}

	public FullText getFullText(){
		return fullText;
	}

	public void setRelated(Related related){
		this.related = related;
	}

	public Related getRelated(){
		return related;
	}

	public void setEnclosure(Enclosure enclosure){
		this.enclosure = enclosure;
	}

	public Enclosure getEnclosure(){
		return enclosure;
	}

	public void setAmplink(String amplink){
		this.amplink = amplink;
	}

	public String getAmplink(){
		return amplink;
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

	public void setTurbo(String turbo){
		this.turbo = turbo;
	}

	public String getTurbo(){
		return turbo;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setPubDate(String pubDate){
		this.pubDate = pubDate;
	}

	public String getPubDate(){
		return pubDate;
	}

	public void setContent(Content content){
		this.content = content;
	}

	public Content getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"ItemItem{" + 
			"full-text = '" + fullText + '\'' + 
			",related = '" + related + '\'' + 
			",enclosure = '" + enclosure + '\'' + 
			",amplink = '" + amplink + '\'' + 
			",link = '" + link + '\'' + 
			",description = '" + description + '\'' + 
			",_turbo = '" + turbo + '\'' + 
			",title = '" + title + '\'' + 
			",category = '" + category + '\'' + 
			",pubDate = '" + pubDate + '\'' + 
			",content = '" + content + '\'' + 
			"}";
		}
}