FROM openjdk:8
ARG build/libs/*.jar
EXPOSE 8080
COPY build/libs/*.jar inventory-service.jar
CMD [ "java", "-jar", "inventory-service.jar" ]