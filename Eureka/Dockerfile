FROM openjdk:17
ARG JAR_FILE=target/Eureka-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} Eureka-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Eureka-0.0.1-SNAPSHOT.jar"]