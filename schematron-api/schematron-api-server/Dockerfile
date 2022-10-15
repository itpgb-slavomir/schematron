FROM openjdk:8u171-jdk-alpine3.8


WORKDIR /var/www
ARG JAR_FILE=target/*.jar

ENTRYPOINT ["java","-jar","/var/www/target/schematron-api-server-0.0.1-SNAPSHOT.jar"]