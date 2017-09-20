CREATE TABLE CATEGORY(
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY(ID)
);

INSERT INTO CATEGORY(NAME, DESCRIPTION, IMAGE_URL,IS_ACTIVE) VALUES('Mobile','This is a mobile','CAT_5','TRUE',);

