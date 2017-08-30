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
--ɾ���û���--
IF EXISTS (SELECT NAME FROM SYSOBJECTS WHERE  NAME = 'article')
	DROP table users
-- �����û��� --
create table users
(
	uid int identity(1,1) primary key not null, -- �û�id
	unickName varchar(20) unique not null ,--�û��ǳƣ�Ωһ
	utrueName varchar(20), --�û���ʵ����
	upassword varchar(20),--����
    uregisterTime datetime,--ע��ʱ��
	uLastLoginTime datetime,--����½ʱ��
	usex varchar(2) CHECK(usex='��' OR usex='Ů') DEFAULT '��', --�û��Ա�
	ubirthday datetime, --�û���������
	umarried  varchar(2) default('��'), --�Ƿ��ѻ�
	uheight int, --���
	uweight int, --����
	articleCount int default(0),
	
)
--ɾ�����±�--
IF EXISTS (SELECT NAME FROM SYSOBJECTS WHERE  NAME = 'article')
	DROP table article
-- �������±�--
create table article
(
	articleId int identity(1,1) primary key not null,--����id
	uid int not null FOREIGN KEY REFERENCES users (uid), --��������id
	articleTitle varchar(50)not null,
	articleDigest varchar(400),--����ժҪ
	articleContent text , --��������
    articleSendTime datetime,--���·���ʱ��
	readCount int, --�����
	commentCount int --������
)
--ɾ�����۱�--
IF EXISTS (SELECT NAME FROM SYSOBJECTS WHERE  NAME = 'comment')
	DROP table comment
--�������۱�--
create table comment
(
	commentId int identity(1,1) not null primary key,
	articleId int not null foreign key references article(articleId),
	commentAuthor varchar(20) default('�����û�'),
	commentContent text,
	commentSendTime datetime
)