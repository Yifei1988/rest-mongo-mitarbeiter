# rest-mongo-mitarbeiter
To learn how to build Multi Docker-Containers of a RESTful API, MongoDB and with Web-server deployed Frontend.

## BACKEND & DATABASE

Language: **Java**  
Framework: **Spring Boot**  
Build Tool: **Gradle**  
IDE: **IntelliJ IDEA**  
APP-Server: **Tomcat** (embedded in Spring Boot)  
Database: **MongoDB**

**Use case:**  
**GET http://localhost:8080/mitarbeiter**  
**GET http://localhost:8080/mitarbeiter/< Id >**  
**GET http://localhost:8080/mitarbeiter/name=< name >**  
**GET http://localhost:8080/mitarbeiter/vorname=< vorname >**  
**POST http://localhost:8080/mitarbeiter** with JSON (Content Type=application/json;charset=utf-8)  
**PUT http://localhost:8080/mitarbeiter/< Id >** with JSON (Content Type=application/json;charset=utf-8)  
**DELETE http://localhost:8080/mitarbeiter/< Id >** with JSON (Content Type=application/json;charset=utf-8)


## FRONTEND

Language: **HTML + JavaScript**  
library: **jQuery**  
IDE: **Bluefish Editor**  
Web-Server: **Nginx**


## Docker-Container

**Steps to run rest service + mongodb + frontend in docker-containers:**  
 1. Build jar: **~/rest-mongo-mitarbeiter $** gradle build  
 2. Make a new folder **~/rest-mongo-mitarbeiter/docker**  
 3. Move <em>rest-mongo-mitarbeiter-0.0.1.jar</em> from **~/rest-mongo-mitarbeiter/build/libs** into **~/rest-mongo-mitarbeiter/docker**  
 4. Add <em>Dockefile</em> and <em>docker-compose.yml</em> in **~/rest-mongo-mitarbeiter/docker** to deploy new docker-image and multi-container  
 5. Add **~/Web** with HTML and JS in **~/rest-mongo-mitarbeiter/docker**  
 6. Build and run multi-container: **~/rest-mongo-mitarbeiter/docker $** sudo docker-compose up -d  
 7. Open browser at **http://localhost:80/** to consume the service by frontend

**Port:**  
host: http://localhost  
RESTful API in embedded Tomcat: **8080**  
Mongodb: **27017**  
Nginx with static content: **80**, **443**

**base image**  
RESTful API: frolvlad/alpine-oraclejdk8:latest  
Frontend: nginx:alpine


