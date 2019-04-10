# Multiple Microservices
Multiples servicios REST para pruebas de Docker Containers.

## Endpoints

- http://localhost:8080/sumar?a=1&b=2
- http://localhost:8081/restar?a=1&b=2
- http://localhost:8082/multiplicar/?a=2&b=3
- http://localhost:8083/dividir?a=100&b=25
- http://localhost:8084/potencia?base=2&exponente=4
- http://localhost:8085/raizcuadrada?a=8
- http://localhost:8086/valorabsoluto?a=-54

## Docker Containers
- jbarillas/suma
- jbarillas/resta
- jbarillas/multiplicacion
- jbarillas/division
- jbarillas/potencia
- jbarillas/raiz-cuadrada
- jbarillas/valor-absoluto

## Dockerfile

```sh
FROM openjdk:8-jre-alpine
EXPOSE 8080
ADD target/multiservicios-suma-0.0.1-SNAPSHOT.jar suma.jar
ENTRYPOINT ["java","-jar","suma.jar"]
```
