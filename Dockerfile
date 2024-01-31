FROM openjdk:17
EXPOSE 8080
ADD target/mongotestproject.jar mongotestproject.jar
ENTRYPOINT ["java", "-jar", "/mongotestproject.jar"]