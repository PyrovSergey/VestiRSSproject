package com.test.vestirssproject.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Rss{

	@SerializedName("_xmlns:yandex")
	private String xmlnsYandex;

	@SerializedName("_xmlns:turbo")
	private String xmlnsTurbo;

	@SerializedName("channel")
	private Channel channel;

	@SerializedName("_xmlns:media")
	private String xmlnsMedia;

	@SerializedName("_version")
	private float version;

	public void setXmlnsYandex(String xmlnsYandex){
		this.xmlnsYandex = xmlnsYandex;
	}

	public String getXmlnsYandex(){
		return xmlnsYandex;
	}

	public void setXmlnsTurbo(String xmlnsTurbo){
		this.xmlnsTurbo = xmlnsTurbo;
	}

	public String getXmlnsTurbo(){
		return xmlnsTurbo;
	}

	public void setChannel(Channel channel){
		this.channel = channel;
	}

	public Channel getChannel(){
		return channel;
	}

	public void setXmlnsMedia(String xmlnsMedia){
		this.xmlnsMedia = xmlnsMedia;
	}

	public String getXmlnsMedia(){
		return xmlnsMedia;
	}

	public void setVersion(float version){
		this.version = version;
	}

	public float getVersion(){
		return version;
	}

	@Override
 	public String toString(){
		return 
			"Rss{" + 
			"_xmlns:yandex = '" + xmlnsYandex + '\'' + 
			",_xmlns:turbo = '" + xmlnsTurbo + '\'' + 
			",channel = '" + channel + '\'' + 
			",_xmlns:media = '" + xmlnsMedia + '\'' + 
			",_version = '" + version + '\'' +
			"}";
		}
}