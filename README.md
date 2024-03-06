# Set up postgreSQL
To use databases while programming, you need to install them on our computer. Since this project is about PostgreSQL, you need to install and configure it, then learn a way to access it from Java.

## What are you going to learn?
* Install and set up PostgreSQL database server. 
* Use JDBC to connect to PostgreSQL database from Java. 
* Manage databases using <span style="color: red;">psql</span>. 
* Manage databases from <span style="color: red;">pgAdmin4</span>.

## Tasks

**Install PostgreSQL and pgAdmin4**

Make sure that the latest version of PostgreSQL database corresponding to your OS is installed on your system.
1. The latest version of PostgreSQL is dowloaded from [the official website](https://www.postgresql.org/download/)
2. The pgAdmin4 is downloaded from [the official website](https://www.pgadmin.org/download/)

**Set up PostgreSQL**

Create a new database named <span style="color: red;">test_db</span> on your system.
1. Executing the <span style="color: red;">psql</span> command in the shell displays a command prompt starting with the username. (That is, the database automatically created for the user can be logged into.)
2. Executing the <span style="color: red;">psql -d test_db</span> in the shell displays a command prompt starting with the database name <span style="color: red;">test_db</span> (That is, the database can be logged into.)

**Connect using psql and create table with data**

Connect to your PostgreSQL server using <span style="color: red;">psql</span> Create a table named <span style="color: red;">dinos</span> in the <span style="color: red;">test_db</span> database and insert the data in the table. Save the table creation statement in the <span style="color: red;">dinos-create.sql</span> file in the repository. Save the insert statements in the <span style="color: red;">dinos-insert.sql</span> file in the repository.
1. Executing the <span style="color: red;">\d dinos</span> commmand in <span style="color: red;">psql</span> after executing the contents of <span style="color: red;">dinos-create.sql</span> while logged into the <span style="color: red;">test_db</span> displays the following lines:
```angular2html
Table "public.dinos"
Column | Type | Collation | Nullable | Default
-------+-----------------------+-----------+----------+----------
name | character varying(20) | | |
height | integer | | |
length | integer | | |
```
2. Executing the <span style="color: red;">SELECT * from dinos;</span> query after executing the contents of <span style="color: red;">dinos-insert.sql</span> in psql shows the following lines:
```angular2html
name | height | length
----------------+--------+---------
Allosaurus | 5 | 12
Apatosaurus | 5 | 23
Argentinosaurus | 21 | 37
Brachiosaurus | 15 | 31
Ceratosaurus | 4 | 6
Megalosaurus | 4 | 8
Oviraptor | 1 | 2
Tyrannosaurus | 7 | 15
Velociraptor | 1 | 2
```
**Connect with pgAdmin4 and get data**

Connect to your PostgreSQL server using [pgAdmin4](https://www.pgadmin.org/download/) and run a query in the <span style="color: red;">test_db</span> database on the <span style="color: red;">dinos</span> table that lists the names of the dinousaurs that are longer than 10 meters. Save the query in the <span style="color: red;">dinos-longer-10.sql</span> file in the repository.
1. Executing the contents of <span style="color: red;">dinos-longer-10.sql</span> from the DBeaver database console displays the following lines:
```angular2html
name
Allosaurus
Apatosaurus
Argentinosaurus
Brachiosaurus
Tyrannosaurus
```

**Connect to PostgreSQL using Java**

Check the <span style="color: red;">Application</span> class and fill the necessary fields for the <span style="color: red;">Database</span>, then check your connection by running the application.
1. Running the application displays the dino names on the console:
```
Allosaurus
Apatosaurus
Argentinosaurus
Brachiosaurus
Ceratosaurus
Megalosaurus
Oviraptor
Tyrannosaurus
Velociraptor
```
**OPTIONAL TASK: Refactor the Application**

As you can see, a lot of things are going on in the Application class, which is not that neat. Try to differentiate the steps of the application by refactoring it!
1. The Application class is refactored.

## Background materials

[Installing and setting up PostgreSQL](https://www.postgresqltutorial.com/postgresql-getting-started/install-postgresql/)

[Short guide about psql](https://www.postgresguide.com/utilities/psql/)

[PostgreSQL documentation page about psql](https://www.postgresql.org/docs/current/app-psql.html)