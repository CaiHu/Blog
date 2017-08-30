--drop db--
drop database blog_db

--create db --
create database blog_db
ON  PRIMARY
( NAME = N'blog_db', 
  FILENAME = N'E:\hands\blog_db_log.mdf',
	SIZE = 5MB , 
	MAXSIZE = UNLIMITED, 
	FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'blog_db_log',
FILENAME = N'E:\hands\blog_db_log.LDF' ,
SIZE = 560KB ,
MAXSIZE = 2048GB ,
FILEGROWTH = 10%)
 COLLATE Chinese_PRC_CI_AS
GO
use blog_db
--删除用户表--
IF EXISTS (SELECT NAME FROM SYSOBJECTS WHERE  NAME = 'article')
	DROP table users
-- 创建用户表 --
create table users
(
	uid int identity(1,1) primary key not null, -- 用户id
	unickName varchar(20) unique not null ,--用户昵称，惟一
	utrueName varchar(20), --用户真实姓名
	upassword varchar(20),--密码
    uregisterTime datetime,--注册时间
	uLastLoginTime datetime,--最后登陆时间
	usex varchar(2) CHECK(usex='男' OR usex='女') DEFAULT '男', --用户性别
	ubirthday datetime, --用户出生日期
	umarried  varchar(2) default('否'), --是否已婚
	uheight int, --身高
	uweight int, --体重
	articleCount int default(0),
	
)
--删除文章表--
IF EXISTS (SELECT NAME FROM SYSOBJECTS WHERE  NAME = 'article')
	DROP table article
-- 创建文章表--
create table article
(
	articleId int identity(1,1) primary key not null,--文章id
	uid int not null FOREIGN KEY REFERENCES users (uid), --文章作者id
	articleTitle varchar(50)not null,
	articleDigest varchar(400),--文章摘要
	articleContent text , --文章内容
    articleSendTime datetime,--文章发表时间
	readCount int, --浏览数
	commentCount int --评论数
)
--删除评论表--
IF EXISTS (SELECT NAME FROM SYSOBJECTS WHERE  NAME = 'comment')
	DROP table comment
--创建评论表--
create table comment
(
	commentId int identity(1,1) not null primary key,
	articleId int not null foreign key references article(articleId),
	commentAuthor varchar(20) default('匿名用户'),
	commentContent text,
	commentSendTime datetime
)