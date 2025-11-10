# ETAPA 1: BUILD (Compilación)
FROM maven:3.8.2-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
COPY .mvn .mvn
COPY src src
RUN mvn clean package -DskipTests

# ETAPA 2: RUNTIME (Ejecución)
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
