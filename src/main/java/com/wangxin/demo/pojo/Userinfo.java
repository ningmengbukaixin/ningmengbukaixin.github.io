package com.wangxin.demo.pojo;

public class Userinfo {
    private Integer id;

    /**
	* 账号
	*/
    private String userName;

    /**
	* 密码
	*/
    private String userPass;

    /**
	* 昵称
	*/
    private String nickName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(userName);
        sb.append(", userpass=").append(userPass);
        sb.append(", nickname=").append(nickName);
        sb.append("]");
        return sb.toString();
    }
}