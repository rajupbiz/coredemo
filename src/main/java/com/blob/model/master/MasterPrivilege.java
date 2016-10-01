package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_privilege")
public class MasterPrivilege {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="privilege_name")
	private String privilegeName ;
	
	@Column(name="privilege_desc")
	private String privilegeDesc;
	
	@Column(name="e")
	private Boolean execute;
	
	@Column(name="v")
	private Boolean view;
	
	@Column(name="u")
	private Boolean update;
	
	@Column(name="d")
	private Boolean detele;
	
	@Column(name="a")
	private Boolean add;
	
	public String getPrivilegeName() {
		return privilegeName;
	}

	public Boolean getExecute() {
		return execute;
	}

	public void setExecute(Boolean execute) {
		this.execute = execute;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
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

	public String getPrivilegeDesc() {
		return privilegeDesc;
	}

	public void setPrivilegeDesc(String privilegeDesc) {
		this.privilegeDesc = privilegeDesc;
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
