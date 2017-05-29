package be.pxl.calllog.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class CallLog implements Serializable {
	
	private static final long serialVersionUID = -3057233435184129791L;

	public static final String DATEFORMAT_PATTERN = "dd/MM/yyyy HH:mm:ss";
 
	private Integer id;				
	private String name;			
	private Date date;				
	private String company;			
	private String description;		
	private int prio;				
	private CallLogStatus state;	
	
	public CallLog () {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	/**
	 * Get the date formatted by pattern "dd/MM/yyyy HH:mm:ss"
	 * @return String
	 */
	public String getDateFormatted() {
		return new SimpleDateFormat(DATEFORMAT_PATTERN).format(this.date);
	}
	
	/**
	 * Get the java 8 LocalDate representation of date
	 * @return LocalDate
	 */
	public LocalDate getLocalDate() {
		return getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();	
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

	public CallLogStatus getState() {
		return state;
	}

	public void setState(CallLogStatus state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CallLog [id=" + id + ", name=" + name + ", date=" + date + ", company=" + company + ", description="
				+ description + ", prio=" + prio + ", state=" + state + "]";
	}
	
}
