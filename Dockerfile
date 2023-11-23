FROM openjdk:17

COPY target/hw3tr4-3.1.5.jar app.jar

EXPOSE 8080

CMD ["java","-jar","app.jar"]