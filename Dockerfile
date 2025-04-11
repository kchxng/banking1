# Use OpenJDK as the base image
FROM openjdk:17-jdk-slim

# Copy your jar file into the container
COPY target/*.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]