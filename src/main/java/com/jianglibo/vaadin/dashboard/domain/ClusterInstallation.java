package com.jianglibo.vaadin.dashboard.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.jianglibo.vaadin.dashboard.annotation.VaadinFormField;
import com.jianglibo.vaadin.dashboard.annotation.VaadinFormField.Ft;

@SuppressWarnings("serial")
@Entity
@Table(name = "clusterInstallation")
public class ClusterInstallation extends BaseEntity {
	
	private String name;
	
	@VaadinFormField(fieldType=Ft.COMBO_BOX, comboKey="clusterInstallationNames")
	private String appname;
	
	@OneToMany
	private Set<BoxAndRole> boxes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	public Set<BoxAndRole> getBoxes() {
		return boxes;
	}

	public void setBoxes(Set<BoxAndRole> boxes) {
		this.boxes = boxes;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}
}
