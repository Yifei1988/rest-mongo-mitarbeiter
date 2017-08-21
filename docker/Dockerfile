FROM frolvlad/alpine-oraclejdk8:latest
VOLUME /tmp
ADD restserver-0.0.1.jar app.jar
EXPOSE 8080
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/micros", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
