CREATE EXTENSION file_fdw;
CREATE SERVER air FOREIGN DATA WRAPPER file_fdw;
CREATE FOREIGN TABLE flight (
 fcity text,
 tcity text,
 fno   character varying[],
 freq  text,
 dep   time,
 arr   time,
 aircraft text,
 stops text
)
SERVER air OPTIONS ( filename 'chmod a+rX C:/Users/prach/Documents/COLLEGE/SEM-4/DBMS/Air-sql/data.csv', format 'csv' );
