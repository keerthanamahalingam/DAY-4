package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDemo")
public class StudentDemo {
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="studentName")
	private String studentName;
	@Column(name="departmentName")
	private String departmentName;
	@Column(name="mailid")
	private String mailid;
		
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	public StudentDemo(int sid, String studentName, String departmentName,String mailid
			) {
		super();
		this.sid = sid;
		this.studentName = studentName;
		this.departmentName=departmentName;
		this.mailid=mailid;
	}
public StudentDemo() 
    {
		
	}
}
