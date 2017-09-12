package cms.service.dhtmlx.forms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Event {
	@XmlAttribute(required=true) 
	 private String id;
	 
	 @XmlAttribute(required=false, name="start_date") 
	 private String start_date;
	 
	 @XmlAttribute(required=false,name="end_date") 
	 private String end_date;
	 
	 @XmlAttribute(required=false) 
	 private String text;
	 
	 @XmlAttribute(required=false) 
	 private String details;

	public String getId() {
		return id;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	
	 
}
