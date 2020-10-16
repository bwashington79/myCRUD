# myCRUD

Notes...

When running Liquibase via Spring command:

./mvnw spring-boot:run

It appears rollback function doesn't work.  I had to
run the command ./mvnw liquibase:update then my rollbacks
worked. 

