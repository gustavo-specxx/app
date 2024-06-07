FROM openjdk:21
ARG JAR_FILE=app\src\*.jar
COPY ${JAR_FILE} appGs.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081
