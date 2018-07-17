package com.one97.testing.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "contest_engagement_master")
public class EngagementMaster implements Serializable {

	public interface EngagemetBasic {
		String getEngagementName();
		public String getContestId();

	}

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	public EngagementMaster() {

	}

	public EngagementMaster(EngagementMaster m1) {
		super();
		this.channel = m1.channel;
		this.contestId = m1.contestId;
		this.engagementName = m1.engagementName;
		this.operator = m1.operator;
		this.circle = m1.circle;
		this.startDate = m1.startDate;
		this.endDate = m1.endDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "engagement_id")
	int engagementId;

	@ManyToOne()
	@JoinColumn(name = "channel_id")
	Channel channel;

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	@Column(name = "contest_id",length=5,nullable=false)
	int contestId;

	@Column(name = "engagement_name")
	String engagementName;

	@Column(name = "operator")
	String operator;

	@Column(name = "circle",length=10)
	String circle;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date")
	Date startDate = new Date();
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date")
	Date endDate = new Date();
	
	@Column(name="criteria_id")
	int criteriaId;
	
	
	@Column(name="zone")
	String zone;
	
	@Column(name="message_type")
	String messageType;
	
	@Column(name="creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	Date creationDate = new Date();
	
	@Column(name="modified_date")
	@Temporal(TemporalType.TIMESTAMP)
	Date modifiedDate = new Date();

	public int getEngagementId() {
		return engagementId;
	}

	public void setEngagementId(int engagementId) {
		this.engagementId = engagementId;
	}

	public int getContestId() {
		return contestId;
	}

	public void setContestId(int contestId) {
		this.contestId = contestId;
	}

	public String getEngagementName() {
		return engagementName;
	}

	public void setEngagementName(String engagementName) {
		this.engagementName = engagementName;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getCriteriaId() {
		return criteriaId;
	}

	public void setCriteriaId(int criteriaId) {
		this.criteriaId = criteriaId;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	

	@Override
	public String toString() {
		return "EngagementMaster [engagementId=" + engagementId + ", channel=" + channel + ", contestId=" + contestId
				+ ", engagementName=" + engagementName + ", operator=" + operator + ", circle=" + circle
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", criteriaId=" + criteriaId + ", messageType="
				+ messageType + ", creationDate=" + creationDate + ", modifiedDate=" + modifiedDate + "]";
	}

}
