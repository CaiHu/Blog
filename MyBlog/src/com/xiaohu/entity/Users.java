package com.xiaohu.entity;

import java.util.Date;

/**
 * Users entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	//  Ù–‘

	private int uid;
	private String unickName;
	private String utrueName;
	private String upassword;
	private Date uregisterTime;
	private Date ulastLoginTime;
	private String usex;
	private Date ubirthday;
	private String umarried;
	private int uheight;
	private int uweight;
	private int articleCount;
	private String uheader;
	
	
	
	
	
	
	public Users(String unickName, String upassword) {
		super();
		this.unickName = unickName;
		this.upassword = upassword;
	}


	public Users(int uid, String unickName, String utrueName, String upassword, Date uregisterTime, Date ulastLoginTime,
			String usex, Date ubirthday, String umarried, int uheight, int uweight, int articleCount) {
		super();
		this.uid = uid;
		this.unickName = unickName;
		this.utrueName = utrueName;
		this.upassword = upassword;
		this.uregisterTime = uregisterTime;
		this.ulastLoginTime = ulastLoginTime;
		this.usex = usex;
		this.ubirthday = ubirthday;
		this.umarried = umarried;
		this.uheight = uheight;
		this.uweight = uweight;
		this.articleCount = articleCount;
	}


	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Users(int uid, String unickName, String utrueName, String upassword, Date uregisterTime, Date ulastLoginTime,
			String usex, Date ubirthday, String umarried, int uheight, int uweight, int articleCount, String uheader) {
		super();
		this.uid = uid;
		this.unickName = unickName;
		this.utrueName = utrueName;
		this.upassword = upassword;
		this.uregisterTime = uregisterTime;
		this.ulastLoginTime = ulastLoginTime;
		this.usex = usex;
		this.ubirthday = ubirthday;
		this.umarried = umarried;
		this.uheight = uheight;
		this.uweight = uweight;
		this.articleCount = articleCount;
		this.uheader = uheader;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUnickName() {
		return unickName;
	}
	public void setUnickName(String unickName) {
		this.unickName = unickName;
	}
	public String getUtrueName() {
		return utrueName;
	}
	public void setUtrueName(String utrueName) {
		this.utrueName = utrueName;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public Date getUregisterTime() {
		return uregisterTime;
	}
	public void setUregisterTime(Date uregisterTime) {
		this.uregisterTime = uregisterTime;
	}
	public Date getUlastLoginTime() {
		return ulastLoginTime;
	}
	public void setUlastLoginTime(Date ulastLoginTime) {
		this.ulastLoginTime = ulastLoginTime;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public Date getUbirthday() {
		return ubirthday;
	}
	public void setUbirthday(Date ubirthday) {
		this.ubirthday = ubirthday;
	}
	public String getUmarried() {
		return umarried;
	}
	public void setUmarried(String umarried) {
		this.umarried = umarried;
	}
	public int getUheight() {
		return uheight;
	}
	public void setUheight(int uheight) {
		this.uheight = uheight;
	}
	public int getUweight() {
		return uweight;
	}
	public void setUweight(int uweight) {
		this.uweight = uweight;
	}
	public int getArticleCount() {
		return articleCount;
	}
	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}
	public String getUheader() {
		return uheader;
	}
	public void setUheader(String uheader) {
		this.uheader = uheader;
	}
	

	}