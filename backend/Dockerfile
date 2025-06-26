# ===== Build stage =====
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copy only pom.xml first to leverage Docker layer caching
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Package the app (skip tests)
RUN mvn clean package -DskipTests

# ===== Runtime stage =====
FROM openjdk:17.0.1-jdk-slim

# Copy the built jar from the build stage
COPY --from=build /app/target/backend-0.0.1-SNAPSHOT.jar app.jar

# Set Render’s port variable
ENV PORT=8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "-Dserver.port=${PORT}", "app.jar"]
