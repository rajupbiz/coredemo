package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="master_role_privilege")
public class MasterRolePrivilege {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="master_role_id")
	private MasterRole masterRole;
	
	@ManyToOne
	@JoinColumn(name="master_privilege_id")
	private MasterPrivilege masterPrivilegeId;
	
	@Column(name="e")
	private Boolean execute;
	
	public MasterRole getMasterRole() {
		return masterRole;
	}

	public void setMasterRole(MasterRole masterRole) {
		this.masterRole = masterRole;
	}

	public Boolean getExecute() {
		return execute;
	}

	public void setExecute(Boolean execute) {
		this.execute = execute;
	}

	public Boolean getView() {
		return view;
	}

	public void setView(Boolean view) {
		this.view = view;
	}

	public Boolean getUpdate() {
		return update;
	}

	public void setUpdate(Boolean update) {
		this.update = update;
	}

	public Boolean getDetele() {
		return detele;
	}

	public void setDetele(Boolean detele) {
		this.detele = detele;
	}

	public Boolean getAdd() {
		return add;
	}

	public void setAdd(Boolean add) {
		this.add = add;
	}

	@Column(name="v")
	private Boolean view;
	
	@Column(name="u")
	private Boolean update;
	
	@Column(name="d")
	private Boolean detele;
	
	@Column(name="a")
	private Boolean add;
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_on")
	private Date createOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MasterPrivilege getMasterPrivilegeId() {
		return masterPrivilegeId;
	}

	public void setMasterPrivilegeId(MasterPrivilege masterPrivilegeId) {
		this.masterPrivilegeId = masterPrivilegeId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
}
