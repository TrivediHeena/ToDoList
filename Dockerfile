FROM openjdk:14-ea-18-jdk
EXPOSE 8089
COPY /target/MyToDoList-0.0.1-SNAPSHOT.jar mytodolistapp.jar
ENTRYPOINT ["java", "-jar", "/mytodolistapp.jar"]

