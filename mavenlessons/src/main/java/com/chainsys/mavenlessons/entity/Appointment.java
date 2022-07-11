package com.chainsys.mavenlessons.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Appointment")
public class Appointment {
	@Id
	@Column(name = "APP_ID")
	private int app_id;
	private Date app_date;
	private int id;
	private String patient_name;
	private int fees_collected;
	private String fees_type;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	@JsonIgnore
	private Doctor doctor;

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	public Date getApp_date() {
		return app_date;
	}

	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatiend_name() {
		return patient_name;
	}

	public void setPatiend_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public int getFees_collected() {
		return fees_collected;
	}

	public void setFees_collected(int fees_collected) {
		this.fees_collected = fees_collected;
	}

	public String getFees_type() {
		return fees_type;
	}

	public void setFees_type(String fees_type) {
		this.fees_type = fees_type;
	}

	@Override
	public String toString() {
		return String.format("%d, %s, %s, %d, %s", app_id, app_date, patient_name, fees_collected, fees_type);
	}
}