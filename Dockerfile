# ETAPA 1: BUILD (Compilación)
FROM maven:3.9.6-jdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
COPY .mvn .mvn
COPY src src
RUN mvn clean package -DskipTests

# ETAPA 2: RUNTIME (Ejecución)
FROM openjdk:17.0.9-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
