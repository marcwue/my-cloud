#
# Build stage
#
FROM maven:3.6.3-openjdk-15 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:15-jdk-alpine
COPY --from=build /home/app/target/config-0.0.1-SNAPSHOT.jar /usr/local/lib/config-0.0.1-SNAPSHOT.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "/usr/local/lib/config-0.0.1-SNAPSHOT.jar"]