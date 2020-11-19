FROM openjdk:8-jre-alpine
LABEL maintainer="abhi"
ADD target/*.jar app.jar
EXPOSE 9300
ENTRYPOINT [ "java", "-jar", "app.jar" ]
