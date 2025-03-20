package test;

import java.io.*;


@SuppressWarnings("serial")
public class AdminBean implements Serializable
{
  private String adminname,adminpass,adminfname,adminlname,admincity,adminmailid;
  public String getAdmincity() {
	return admincity;
}

public void setAdmincity(String admincity) {
	this.admincity = admincity;
}

private long adminphno;
  
  public AdminBean() {
	  
  }

public String getAdminname() {
	return adminname;
}

public void setAdminname(String adminname) {
	this.adminname = adminname;
}

public String getAdminpass() {
	return adminpass;
}

public void setAdminpass(String adminpass) {
	this.adminpass = adminpass;
}

public String getAdminfname() {
	return adminfname;
}

public void setAdminfname(String adminfname) {
	this.adminfname = adminfname;
}

public String getAdminlname() {
	return adminlname;
}

public void setAdminlname(String adminlname) {
	this.adminlname = adminlname;
}

public String getAdminmailid() {
	return adminmailid;
}

public void setAdminmailid(String adminmailid) {
	this.adminmailid = adminmailid;
}

public long getAdminphno() {
	return adminphno;
}

public void setAdminphno(long adminphno) {
	this.adminphno = adminphno;
}
}
