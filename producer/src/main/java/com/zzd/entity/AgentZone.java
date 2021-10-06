package com.zzd.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "agent_zone")
public class AgentZone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7226647598763762930L;

	@Id
	private String id;
	private String zoneCode;
	private Long agentid;
	private Long creatorid;
	private Date createTime;

	public AgentZone() {

	}



}
