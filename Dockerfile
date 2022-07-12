FROM adoptopenjdk/openjdk11:alpine-jre
CMD ls -al
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]





