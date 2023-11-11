FROM openjdk:17
ARG JAR_FILE=target/Estudiantes-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} Estudiantes-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Estudiantes-0.0.1-SNAPSHOT.jar"]