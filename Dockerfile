FROM openjdk:8
COPY ./build/libs/spring-app-0.0.1-SNAPSHOT.jar /spring-app-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-app-0.0.1-SNAPSHOT.jar"]