FROM openjdk:8-jre-alpine
EXPOSE 8083
ADD target/multiservicios-division-0.0.1-SNAPSHOT.jar division.jar
ENTRYPOINT ["java", "-jar", "division.jar"]
