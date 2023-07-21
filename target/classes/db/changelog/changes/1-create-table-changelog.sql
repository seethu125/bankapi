CREATE TABLE IF NOT EXISTS banks(
	id  bigint PRIMARY KEY,
	name VARCHAR (49) NOT NULL
);

CREATE TABLE IF NOT EXISTS branches(
	ifsc  varchar(11)  PRIMARY KEY,
	bank_id bigint NOT NULL,
	branch varchar(74) NOT NULL,
	address varchar(195) NOT NULL,
	city varchar(50) NOT NULL,
	district varchar(50) NOT NULL,
	state  varchar(26) NOT NULL,	
	FOREIGN KEY (bank_id) REFERENCES banks(id)
);

CREATE OR REPLACE VIEW bank_branches AS
  SELECT ifsc, br.bank_id, branch, address, city, district, state, b.name as bank_name
  FROM banks b
  INNER JOIN branches br
  ON b.id = br.bank_id;

