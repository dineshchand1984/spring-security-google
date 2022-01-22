psql -d sonarqubedb

CREATE TABLE Product (
	id INTEGER PRIMARY KEY,
	name VARCHAR (50) NOT NULL,
	picture_url VARCHAR (100),
	price NUMERIC (5, 2)
);

INSERT INTO Product values ( 1, 'Maggi' ,   '/maggi' ,  10.00);
INSERT INTO Product values ( 2, 'Eggs' ,    '/eggs' ,   30.00);
INSERT INTO Product values ( 3, 'Donut' ,   '/donut',   15.00);
INSERT INTO Product values ( 4, 'Namkeen' , '/namkeen', 35.00);
INSERT INTO Product values ( 5, 'Bread' ,   '/bread',   38.00);
INSERT INTO Product values ( 6, 'Milk' ,    '/milk' ,   24.00);

INSERT INTO Product values ( 7, 'Maggi' ,   '/maggi' ,  10.00);
INSERT INTO Product values ( 8, 'Eggs' ,    '/eggs' ,   30.00);
INSERT INTO Product values ( 9, 'Donut' ,   '/donut',   15.00);
INSERT INTO Product values ( 10, 'Namkeen' , '/namkeen', 35.00);
INSERT INTO Product values ( 11, 'Bread' ,   '/bread',   38.00);
INSERT INTO Product values ( 12, 'Milk' ,    '/milk' ,   24.00);


CREATE TABLE POrder (
	id INTEGER UNIQUE NOT NULL, 
	date_created TIMESTAMP NOT NULL,
	status VARCHAR (50)
);
ALTER TABLE POrder ADD PRIMARY KEY (id);

ALTER TABLE POrder alter date_created set default now();
INSERT INTO POrder (id, status ) values ( 1, 'Completed');
INSERT INTO POrder (id, status ) values ( 2, 'Completed');
INSERT INTO POrder (id, status ) values ( 3, 'Cancelled');
INSERT INTO POrder (id, status ) values ( 4, 'Pending');
INSERT INTO POrder (id, status ) values ( 5, 'Preparing');
INSERT INTO POrder (id, status ) values ( 6, 'Waiting');

CREATE TABLE order_product (
	quantity INTEGER,
	order_id INTEGER REFERENCES POrder(id),
	product_id INTEGER REFERENCES Product(id),
	PRIMARY KEY (order_id,product_id)
);

INSERT INTO order_product values ( 2, 1 , 1);
INSERT INTO order_product values ( 2, 1 , 2);
INSERT INTO order_product values ( 2, 1 , 3);
INSERT INTO order_product values ( 2, 2 , 2);
INSERT INTO order_product values ( 2, 2 , 4);
INSERT INTO order_product values ( 20, 3 , 1);
INSERT INTO order_product values ( 5, 3 , 3);

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO sonarqubeuser;