# Air-sql
Database management system project. Made with PostGRE SQL and Java.

### Requirements

Java platform (The project is made with netbeans 13.0.2)

JDK 11.0.3

JRE 8.0.2

Python 3.4

PostgreSQL(PgAdmin-4(4.18))

.jar files ([jcalendar 1.4](http://www.java2s.com/Code/Jar/j/Downloadjcalendar14jar.htm) ,[postgresql-42.2.12](https://jdbc.postgresql.org/download.html) ,[jdatepicker-1.3.4](http://www.java2s.com/Code/Jar/j/Downloadjdatepicker132jar.htm))

**Running scrape.py will generate a chk.csv file in the path** 

### Populate the table 

To populate the table for flight details, we have scrapped flight schedules of AirIndia in real time 
using BeautifulSoup4 and pandas . The scrapped file is converted into a .csv file and that is uploaded to the respective table writing the following command in psql shell :

**\COPY public.table_name from ‘path to CSV file’ DELIMITER ‘,’ CSV HEADER;**

- Connecting the python file to the SQL server is done by writing a config file (which contains the
.ini file with parameters [name of the database, user, password, host]) and calling it in the main
file which connects it to the database by using psycopg2 python library.

- Fare table
 
![fare](https://github.com/PracheeJaviya/Air-sql/blob/master/Capture.PNG "fare table")

After populating the tables, begin running the program from login.java.

On successful logins you will see the following windows one after the other : 

![Windows](https://github.com/PracheeJaviya/Air-sql/blob/master/1.PNG "Windows")

![Seating Arrangement](https://github.com/PracheeJaviya/Air-sql/blob/master/seat_selection.png)
