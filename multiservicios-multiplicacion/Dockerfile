FROM openjdk:8-jre-alpine
EXPOSE 8082
ADD target/multiservicios-multiplicacion-0.0.1-SNAPSHOT.jar multiplicacion.jar
ENTRYPOINT ["java", "-jar", "multiplicacion.jar"]
