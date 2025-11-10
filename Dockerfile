# ETAPA 1: BUILD (Compilación)
# Usa la imagen de Maven para compilar la aplicación y generar el JAR
FROM maven:3.9.6-openjdk-17-slim AS build
WORKDIR /app
# Copia los archivos de Maven para descargar dependencias
COPY pom.xml .
COPY .mvn .mvn
# Copia el resto del código
COPY src src
# Ejecuta la compilación de Maven
RUN mvn clean package -DskipTests

# ETAPA 2: RUNTIME (Ejecución)
# Usa una imagen ligera de OpenJDK solo para ejecutar la aplicación
FROM openjdk:17-jdk-slim
WORKDIR /app
# Copia el JAR generado de la etapa de 'build'
COPY --from=build /app/target/*.jar app.jar
# El puerto 8080 es el puerto por defecto de Render y Spring Boot
EXPOSE 8080
# Comando de inicio: ejecuta la aplicación Java
ENTRYPOINT ["java", "-jar", "app.jar"]