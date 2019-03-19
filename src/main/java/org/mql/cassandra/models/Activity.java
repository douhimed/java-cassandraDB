package org.mql.cassandra.models;
import java.util.Date;

public class Activity {

	private int id;
	private Date datetime;
	private String event;
	private String code_used;

	public Activity() {
		// TODO Auto-generated constructor stub
	}

	public Activity(int id, Date datetime, String event, String code_used) {
		super();
		this.id = id;
		this.datetime = datetime;
		this.event = event;
		this.code_used = code_used;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getCode_used() {
		return code_used;
	}

	public void setCode_used(String code_used) {
		this.code_used = code_used;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", datetime=" + datetime + ", event=" + event + ", code_used=" + code_used + "]";
	}

}
