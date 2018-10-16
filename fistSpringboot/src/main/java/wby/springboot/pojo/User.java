package wby.springboot.pojo;

import java.util.Date;

public class User {
	
	private String name;
	private String password;
	private Integer age;
	private Date birthday;
	private String desc;

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public Integer getAge() {
		return age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getDesc() {
		return desc;
	}
}
