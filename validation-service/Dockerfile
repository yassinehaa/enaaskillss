FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/validation-service-0.0.1-SNAPSHOT.jar validation-service.jar

ENTRYPOINT ["java", "-jar", "validation-service.jar"]
