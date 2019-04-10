FROM openjdk:8-jre-alpine
EXPOSE 8080
ADD target/multiservicios-suma-0.0.1-SNAPSHOT.jar suma.jar
ENTRYPOINT ["java", "-jar", "suma.jar"]
