FROM openjdk:8-alpine

COPY target/knolbucks-0.1.0.jar /artifact/

RUN ls /artifact

ENTRYPOINT java -jar /artifact/knolbucks-0.1.0.jar