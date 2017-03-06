CREATE DATABASE `taskdb` 

USE 'taskdb'

CREATE TABLE task
	id int(10) NOT NULL
	tittle VARCHAR(30),
	description VARCHAR(255),
	complete int(10), -- false = 0, true = 1
	PRIMARY KEY ('id'), 
