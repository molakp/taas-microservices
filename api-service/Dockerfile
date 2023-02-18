FROM amazoncorretto:11-alpine3.14
COPY /target/*api-service-application*.jar api-service.jar
EXPOSE 8080
RUN java -version
CMD ["java", "-jar", "api-service.jar"]