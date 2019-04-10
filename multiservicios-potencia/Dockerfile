FROM openjdk:8-jre-alpine
EXPOSE 8084
ADD target/multiservicios-potencia-0.0.1-SNAPSHOT.jar potencia.jar
ENTRYPOINT ["java", "-jar", "potencia.jar"]
