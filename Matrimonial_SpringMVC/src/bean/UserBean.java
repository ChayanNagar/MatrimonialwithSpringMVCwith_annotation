package bean;
import java.util.Date;
public class UserBean {
String name,gender,religion,tongue,caste,country,email,password;
Date dob;


int mnumber;
public String getName() {
	return name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getReligion() {
	return religion;
}
public void setReligion(String religion) {
	this.religion = religion;
}
public String getTongue() {
	return tongue;
}
public void setTongue(String tongue) {
	this.tongue = tongue;
}
public String getCaste() {
	return caste;
}
public void setCaste(String caste) {
	this.caste = caste;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public int getMnumber() {
	return mnumber;
}
public void setMnumber(int mnumber) {
	this.mnumber = mnumber;
}
}
