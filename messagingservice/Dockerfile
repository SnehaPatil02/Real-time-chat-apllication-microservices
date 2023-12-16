# Use a base image with JDK to build the project
FROM maven:3.8.5-openjdk-17  as build

# Set the working directory in the Docker image
WORKDIR /app

# Copy the pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package

# For the runtime image, use a JRE base image
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
