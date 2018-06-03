# Spring Boot + Mybatis + H2 DB


# DataBase
DB name: H2  (in memory DB)<br>
DB site: http://www.h2database.com/html/quickstart.html<br>

DB access URL: http://localhost:8080/h2-console/<br>

Driver Class: org.h2.Driver<br>
JDBC URL : jdbc:h2:mem:test<br>
User Name : sa<br>
Password : none<br>

# Table Design
SQL file: /resources/db/schema.sql<br>

# ORM framework
Use Mybatis<br><br>

# POST /transactions
Use synchronized method to handle concurrent requests<br><br>

# GET /statistics
When it come to calculate SUM,AVG,MAX,MIN,COUNT, I leave these jobs to DB, using DB built-in function to get the result.<br>
So in JAVA part, the code is very simple. time O(1), memory O(1)<br><br>

Another solution is load the data from DB to JVM, use a List to receive data,then go through the List to get the result.<br>
This approach actually switch the calculate pressure from DB engine to JAVA code.<br>
The best performance I can get is time O(n), memory O(n) &nbsp;&nbsp;  n = transaction count of last 60s



