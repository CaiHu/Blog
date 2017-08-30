package com.xiaohu.entity;

import java.util.Date;

/**
 * Comment entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private Integer articleId;
	private String commentAuthor;
	private String commentContent;
	private Date commentSendTime;

	// Constructors

	public Comment(Integer commentId, Integer articleId, String commentAuthor,
			String commentContent, Date commentSendTime) {
		super();
		this.commentId = commentId;
		this.articleId = articleId;
		this.commentAuthor = commentAuthor;
		this.commentContent = commentContent;
		this.commentSendTime = commentSendTime;
	}

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(Integer articleId) {
		this.articleId = articleId;
	}

	/** full constructor */
	public Comment(Integer articleId, String commentAuthor,
			String commentContent, Date commentSendTime) {
		this.articleId = articleId;
		this.commentAuthor = commentAuthor;
		this.commentContent = commentContent;
		this.commentSendTime = commentSendTime;
	}

	// Property accessors

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getCommentAuthor() {
		return this.commentAuthor;
	}

	public void setCommentAuthor(String commentAuthor) {
		this.commentAuthor = commentAuthor;
	}

	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentSendTime() {
		return this.commentSendTime;
	}

	public void setCommentSendTime(Date commentSendTime) {
		this.commentSendTime = commentSendTime;
	}

}