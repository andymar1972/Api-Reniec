FROM openjdk:8-jdk-alpine
COPY "./target/reniec-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8003
ENTRYPOINT [ "java","-jar","app.jar" ]