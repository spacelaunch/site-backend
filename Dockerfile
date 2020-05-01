FROM openjdk:8-jdk-alpine
RUN addgroup -S spacegroup && adduser -S spaceuser -G spacegroup
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]