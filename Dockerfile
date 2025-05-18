FROM openjdk:17
COPY target/*.jar app.jar
EXPOSE 18080
ENTRYPOINT ["java", "-jar", "/app.jar"]
