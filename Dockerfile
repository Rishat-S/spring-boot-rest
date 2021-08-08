FROM openjdk:8-jdk-alpine

EXPOSE 8888

ADD target/spring_boot_rest-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java", "-jar", "/myapp.jar"]
