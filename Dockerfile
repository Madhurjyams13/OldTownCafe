FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine-slim
WORKDIR /opt
ENV PORT 8081
EXPOSE 8081
COPY target/*.jar  /opt/my-app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar my-app.jar
