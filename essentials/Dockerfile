FROM maven:3.8.7-openjdk-18-slim as builder
ARG VERSION=0.0.1-SNAPSHOT
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/

RUN mvn clean
RUN mvn package
COPY target/essentials-${VERSION}.jar target/application.jar

FROM openjdk:18
WORKDIR /app/

COPY --from=builder /build/target/application.jar /app/
CMD java -jar /app/application.jar