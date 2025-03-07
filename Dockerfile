# Use official Maven image to build the application
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Set working directory inside the container
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Use an official OpenJDK runtime image
FROM eclipse-temurin:21-jre

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the application port (adjust based on your app configuration)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
