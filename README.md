# myCRUD

Notes...

When running Liquibase via Spring command:

./mvnw spring-boot:run

It appears rollback function doesn't work.  I had to
run the command ./mvnw liquibase:update then my rollbacks
worked. 

Start docker container:
docker run --name jugtours-postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=jugtours -p 5432:5432 -d postgres -d postgres

Rollback:

mvn liquibase:rollback -Dliquibase.rollbackTag=<tag version>
