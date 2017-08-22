# rest-mongo-mitarbeiter
to learn how to build a restful api and mongodb with spring boot

## BACKEND & DATABASE

Language: **Java**  
Framework: **Spring Boot**  
Build Tool: **Gradle**  
IDE: **IntelliJ IDEA**  
Database: **MongoDB**

** Steps to run rest service and mongodb in docker container:**
 1. Build jar: **~/rest-mongo-mitarbeiter $** gradle build  
 2. Make a new folder **~/rest-mongo-mitarbeiter/docker**  
 3. Move <em>rest-mongo-mitarbeiter-0.0.1.jar</em> from **~/rest-mongo-mitarbeiter/build/libs** into **~/rest-mongo-mitarbeiter/docker**  
 4. Add <em>Dockefile</em> and <em>docker-compose.yml</em> in **~/rest-mongo-mitarbeiter/docker** for deploy of new docker-image and multi-container  
 5. Build and run multi-container: **~/rest-mongo-mitarbeiter/docker $** sudo docker-compose up -d  
 6. Open browser at **http://localhost:8080/mitarbeiter**

### Use case:  
**GET http://localhost:8080/mitarbeiter**  
**GET http://localhost:8080/mitarbeiter/< Id >**  
**GET http://localhost:8080/mitarbeiter/name=< name >**  
**GET http://localhost:8080/mitarbeiter/vorname=< vorname >**  
**POST http://localhost:8080/mitarbeiter** with JSON (Content Type=application/json;charset=utf-8)  
**PUT http://localhost:8080/mitarbeiter/< Id >** with JSON (Content Type=application/json;charset=utf-8)  
**DELETE http://localhost:8080/mitarbeiter/< Id >** with JSON (Content Type=application/json;charset=utf-8)

