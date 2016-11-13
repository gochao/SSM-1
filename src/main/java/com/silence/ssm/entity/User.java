package com.silence.ssm.entity;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String image;

    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

	public User(String username, String password, String phone, String image, String info) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.image = image;
		this.info = info;
	}

	public User() {
		super();
	}
    
}