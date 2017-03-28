= Demo-Client
Enthält die Beispiel-Anwendung die gemonitored werden soll. Zum Starten (mit aktivierter Security) einfach
```
cd demo-client
./mvnw spring-boot:run
```
ausführen.

Username: user
Password: clientpass

Zum Abschalten der Security den Parameter `-Drun.arguments=--spring.profiles.active=inseucre` mitgeben.

= Demo-Server
Enthält den Beispiel Spring-Boot-Admin Server. Zum Starten (mit aktivierter Security) einfach
```
cd demo-server
./mvnw spring-boot:run
```
ausführen.

Username: admin
Password: serverpass

Zum Abschalten der Security den Parameter `-Drun.arguments=--spring.profiles.active=inseucre` mitgeben.
