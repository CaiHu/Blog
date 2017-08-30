package com.xiaohu.entity;

import java.util.Date;

/**
 * Article entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Article {

	// Fields

	private int articleId;
	private int uid;
	private String articleTitle;
	private String articleDigest;
	private String articleContent;
	private Date articleSendTime;
	private int readCount;
	private int commentCount;

	// Constructors
	
	/** default constructor */
	public Article() {
	}

	public Article(int articleId, int uid, String articleTitle, String articleDigest, String articleContent,
			Date articleSendTime, int readCount, int commentCount) {
		super();
		this.articleId = articleId;
		this.uid = uid;
		this.articleTitle = articleTitle;
		this.articleDigest = articleDigest;
		this.articleContent = articleContent;
		this.articleSendTime = articleSendTime;
		this.readCount = readCount;
		this.commentCount = commentCount;
	}

	/** minimal constructor */
	public Article(Integer uid, String articleTitle) {
		this.uid = uid;
		this.articleTitle = articleTitle;
	}

	/** full constructor */
	public Article(Integer uid, String articleTitle, String articleDigest,
			String articleContent, Date articleSendTime, Integer readCount,
			Integer commentCount) {
		this.uid = uid;
		this.articleTitle = articleTitle;
		this.articleDigest = articleDigest;
		this.articleContent = articleContent;
		this.articleSendTime = articleSendTime;
		this.readCount = readCount;
		this.commentCount = commentCount;
	}

	// Property accessors

	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getArticleTitle() {
		return this.articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleDigest() {
		return this.articleDigest;
	}

	public void setArticleDigest(String articleDigest) {
		this.articleDigest = articleDigest;
	}

	public String getArticleContent() {
		return this.articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public Date getArticleSendTime() {
		return this.articleSendTime;
	}

	public void setArticleSendTime(Date articleSendTime) {
		this.articleSendTime = articleSendTime;
	}

	public Integer getReadCount() {
		return this.readCount;
	}

	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}

	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public Article(Integer articleId, Integer uid, String articleTitle,
			String articleDigest, String articleContent, Date articleSendTime,
			Integer readCount, Integer commentCount) {
		super();
		this.articleId = articleId;
		this.uid = uid;
		this.articleTitle = articleTitle;
		this.articleDigest = articleDigest;
		this.articleContent = articleContent;
		this.articleSendTime = articleSendTime;
		this.readCount = readCount;
		this.commentCount = commentCount;
	}

}