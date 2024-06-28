FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-20-jdk -y
COPY . .
RUN ./gradlew bootJar --no-daemon

FROM openjdk:20-jdk-slim
EXPOSE 9090
COPY --from-build /build/libs/demo-1.jar app.jar

LABEL authors="asus"

ENTRYPOINT ["java",".jar","app.jar","top", "-b"]