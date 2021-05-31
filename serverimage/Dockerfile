FROM adoptopenjdk/openjdk11
RUN adduser --system --group spring
USER spring:spring
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
