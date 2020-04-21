DROP TABLE IF EXISTS a319;
DROP TABLE IF EXISTS a320;
DROP TABLE IF EXISTS b777_er;
DROP TABLE IF EXISTS b787;

CREATE TABLE IF NOT EXISTS a319
(
    seat_number INTEGER,
    status VARCHAR default = 'NT',
    flightno VARCHAR,
    calss VARCHAR,
    date VARCHAR
);


CREATE TABLE IF NOT EXISTS a320
(
    seat_number INTEGER,
    status VARCHAR default = 'NT',
    flightno VARCHAR,
    calss VARCHAR,
    date VARCHAR
);


CREATE TABLE IF NOT EXISTS b787
(
    seat_number INTEGER,
    status VARCHAR default = 'NT',
    flightno VARCHAR,
    calss VARCHAR,
    date VARCHAR
);


CREATE TABLE IF NOT EXISTS b777_er
(
    seat_number INTEGER,
    status VARCHAR default = 'NT',
    flightno VARCHAR,
    calss VARCHAR,
    date VARCHAR
);
