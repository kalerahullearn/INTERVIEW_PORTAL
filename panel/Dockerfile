FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-jammy AS runtime
WORKDIR /app
COPY --from=build /app/target/panel-0.0.1-SNAPSHOT.jar ./panel.jar
ENTRYPOINT ["java", "-jar", "panel.jar"]
