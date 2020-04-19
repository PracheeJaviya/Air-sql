create table place(
    city text,
    state text);
-- to populate table run the query in psql shell
\COPY public.place from 'C:/Users/patel/Desktop/CLG/Sem - 4/DBMS/Air-sql/city_list.csv' DELIMITER ',' CSV HEADER;
