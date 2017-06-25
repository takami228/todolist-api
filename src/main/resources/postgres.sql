CREATE TABLE items (
id SERIAL PRIMARY KEY
, title VARCHAR(256)
, description VARCHAR(1024)
, status INT);

INSERT INTO items VALUES
 (0,'sample1', 'description1', 0)
 ,  (1,'sample2', 'description2', 1);