CREATE TABLE "member" 
(
   "user_id" CHARACTER VARYING(100) NOT NULL, 
   "email" CHARACTER VARYING(100), 
   "password" CHARACTER VARYING(100), 
   "first_name" CHARACTER VARYING(50), 
   "last_name" CHARACTER VARYING(50), 
   CONSTRAINT pk_member_user_id PRIMARY KEY("user_id") 
);

CREATE TABLE "member_me2day" 
(
   "user_id" CHARACTER VARYING(100) NOT NULL, 
   "user_key" CHARACTER VARYING(200), 
   CONSTRAINT pk_member_me2day_user_id PRIMARY KEY("user_id") 
);
