FROM maven:3.8.1-openjdk-15 AS build

COPY ./ ./
RUN mvn clean package
FROM openjdk:14-ea-18-jdk
EXPOSE 8089
COPY --from=build /MyToDoList/target/MyToDoList-0.0.1-SNAPSHOT.jar mytodolistapp.jar
CMD ["java", "-jar", "/mytodolistapp.jar"]

