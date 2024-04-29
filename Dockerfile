FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/h2db-test-example.jar h2db-test-example.jar
ENTRYPOINT [ "java","-jar","/h2db-test-example.jar" ]