# JDBC-with-MySQL-5.5
Java Database Connectivity with MySQL database.

## JDBC (Java Database Connectivity) :
**JDBC** or **Java Database Connectivity** is a *Java API* to connect and execute the query with the database. It is a specification from Sun microsystems that provides a standard abstraction(API or Protocol) for java applications to communicate with various databases. It provides the language with java database connectivity standards. It is used to write programs required to access databases. JDBC, along with the database driver, can access databases and spreadsheets. The enterprise data stored in a relational database(RDB) can be accessed with the help of JDBC APIs.

### Definition of JDBC(Java Database Connectivity) :
- _JDBC is an API(Application programming interface) used in java programming to interact with databases. The classes and interfaces of JDBC allow the application to send requests made by users to the specified database._

### Purpose of JDBC :
_Enterprise applications created using the JAVA EE technology need to interact with databases to store application-specific information. So, interacting with a database requires efficient database connectivity, which can be achieved by using the ODBC(Open database connectivity) driver. This driver is used with JDBC to interact or communicate with various kinds of databases such as Oracle, MS Access, Mysql, and SQL server database._

### Architecture of JDBC :

![image](https://github.com/kinshuk-code-1729/JDBC-with-MySQL-5.5/assets/90320839/5577ca3e-5b38-47df-a5ff-457de6124f14)

- **Application:** _It is a java applet or a servlet that communicates with a data source._
- **The JDBC API:** _The JDBC API allows Java programs to execute SQL statements and retrieve results._
- **DriverManager:** _It plays an important role in the JDBC architecture. It uses some database-specific drivers to effectively connect enterprise applications to databases._
- **JDBC drivers:** _To communicate with a data source through JDBC, you need a JDBC driver that intelligently communicates with the respective data source._
