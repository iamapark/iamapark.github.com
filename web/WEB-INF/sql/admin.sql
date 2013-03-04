CREATE TABLE "admin" 
(
   "admin_id" CHARACTER VARYING(100) NOT NULL, 
   "password" CHARACTER VARYING(100), 
   CONSTRAINT pk_admin_admin_id PRIMARY KEY("admin_id") 
);