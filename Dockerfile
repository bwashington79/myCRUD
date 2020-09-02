FROM adoptopenjdk/openjdk11:alpine

RUN apk update && apk upgrade && apk add bash

RUN mkdir /app

# COPY ["src", ".mvn", "mvnw", "pom.xml", "/app/"]

COPY ["src", "/app/src/"]

COPY [".mvn", "/app/.mvn/"]

COPY ["mvnw", "pom.xml", "/app/"]

WORKDIR /app

#RUN ./mvnw verify






