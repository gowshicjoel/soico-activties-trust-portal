package com.iim.socioactivities.Model;

import java.sql.Date;

public class User {
     int Num_user_id;
	String Vch_user_name;
	String Vch_user_password;
	int num_created_by;
	int Num_user_age;
	int Num_user_mobileno;
	String Vch_user_emailid;
	String Vch_user_address;
	String Vch_user_education;
	String Vch_user_job;
	String Vch_user_bloodtype;
	String Chr_active_status;
	String Dtt_join_date;
	String Dtt_creation_date;
	int register_id;
	String name;          
	int age;            
	String address;        
	String email_id;       
	int mobile_no;
	char volunteerMemberInd; //M or V
	public int getRegister_id() {
		return register_id;
	}
	public void setRegister_id(int register_id) {
		this.register_id = register_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String emial_id) {
		this.email_id = emial_id;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public int getNum_user_id() {
		return Num_user_id;
	}
	public void setNum_user_id(int num_user_id) {
		Num_user_id = num_user_id;
	}
	public String getVch_user_name() {
		return Vch_user_name;
	}
	public void setVch_user_name(String vch_user_name) {
		Vch_user_name = vch_user_name;
	}
	public String getVch_user_password() {
		return Vch_user_password;
	}
	public void setVch_user_password(String vch_user_password) {
		Vch_user_password = vch_user_password;
	}
	public int getNum_user_age() {
		return Num_user_age;
	}
	public void setNum_user_age(int num_user_age) {
		Num_user_age = num_user_age;
	}
	public int getNum_user_mobileno() {
		return Num_user_mobileno;
	}
	public void setNum_user_mobileno(int num_user_mobileno) {
		Num_user_mobileno = num_user_mobileno;
	}
	public String getVch_user_emailid() {
		return Vch_user_emailid;
	}
	public void setVch_user_emailid(String vch_user_emailid) {
		Vch_user_emailid = vch_user_emailid;
	}
	public String getVch_user_address() {
		return Vch_user_address;
	}
	public void setVch_user_address(String vch_user_address) {
		Vch_user_address = vch_user_address;
	}
	public String getVch_user_education() {
		return Vch_user_education;
	}
	public void setVch_user_education(String vch_user_education) {
		Vch_user_education = vch_user_education;
	}
	public String getVch_user_job() {
		return Vch_user_job;
	}
	public void setVch_user_job(String vch_user_job) {
		Vch_user_job = vch_user_job;
	}
	public String getVch_user_bloodtype() {
		return Vch_user_bloodtype;
	}
	public void setVch_user_bloodtype(String vch_user_bloodtype) {
		Vch_user_bloodtype = vch_user_bloodtype;
	}
	public String getChr_active_status() {
		return Chr_active_status;
	}
	public void setChr_active_status(String chr_active_status) {
		Chr_active_status = chr_active_status;
	}
	public String getDtt_join_date() {
		return Dtt_join_date;
	}
	public void setDtt_join_date(String dtt_join_date) {
		Dtt_join_date = dtt_join_date;
	}
	public String getDtt_creation_date() {
		return Dtt_creation_date;
	}
	public void setDtt_creation_date(String dtt_creation_date) {
		Dtt_creation_date = dtt_creation_date;
	}

	public int getNum_created_by() {
		return num_created_by;
	}
	public void setNum_created_by(int num_created_by) {
		this.num_created_by = num_created_by;
	}
	public char getVolunteerMemberInd() {
		return volunteerMemberInd;
	}
	public void setVolunteerMemberInd(char volunteerMemberInd) {
		this.volunteerMemberInd = volunteerMemberInd;
	}
}
