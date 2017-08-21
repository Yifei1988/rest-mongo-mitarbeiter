# rest-mongo-mitarbeiter
to learn how to build a restful api and mongodb with spring boot

1. Build jar: <strong>~/rest-mongo-mitarbeiter $</strong> gradle build  
2. Make a new folder <strong> ~/rest-mongo-mitarbeiter/docker</strong>  
3. Move <em>rest-mongo-mitarbeiter-0.0.1.jar</em> from <strong>~/rest-mongo-mitarbeiter/build/libs</strong> into <strong>~/rest-mongo-mitarbeiter/docker</strong>  
4. Add <em>Dockefile</em> and <em>docker-compose.yml</em> in <strong>~/rest-mongo-mitarbeiter/docker</strong> for deploy of new docker-image and multi-container  
5. Build and run multi-container: <strong>~/rest-mongo-mitarbeiter/docker $</strong> sudo docker-compose up -d  
6. Open browser at <strong>http://localhost:8080/mitarbeiter</strong>

Use case:  
<strong>GET http://localhost:8080/mitarbeiter</strong>  
<strong>GET http://localhost:8080/mitarbeiter/&lt;Id></strong>  
<strong>GET http://localhost:8080/mitarbeiter/name=&lt;name></strong>  
<strong>GET http://localhost:8080/mitarbeiter/vorname=&lt;vorname></strong>  
<strong>POST http://localhost:8080/mitarbeiter</strong> with JSON (Content Type=application/json;charset=utf-8)  
<strong>PUT http://localhost:8080/mitarbeiter/&lt;Id></strong> with JSON (Content Type=application/json;charset=utf-8)  
<strong>DELETE http://localhost:8080/mitarbeiter/&lt;Id></strong> with JSON (Content Type=application/json;charset=utf-8)
