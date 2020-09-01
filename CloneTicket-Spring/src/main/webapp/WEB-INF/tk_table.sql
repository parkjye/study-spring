--------------------TABLE 목록--------------------

/* tk_users */
create table tk_users(
	users_num NUMBER PRIMARY KEY,
	users_id VARCHAR2(50) NOT NULL,
	users_pwd VARCHAR2(50) NOT NULL,
	users_phone VARCHAR2(50),
	users_addr VARCHAR2(250)
);


/* tk_ */




--------------------시퀀스 목록--------------------
create SEQUENCE tk_users_seq;