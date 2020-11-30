FROM adoptopenjdk/openjdk11:jdk-11.0.9_11.1-alpine
MAINTAINER immigrately.ca
RUN adduser -D immigrately
USER immigrately
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} immigrately.jar
ENTRYPOINT ["java","-jar","/immigrately.jar"]
